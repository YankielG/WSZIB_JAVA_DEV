package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.ProfilesDao;
import pl.edu.wszib.jwd.java_dev.dao.HomeDao;
import pl.edu.wszib.jwd.java_dev.model.Profiles;
import pl.edu.wszib.jwd.java_dev.model.Home;

@Controller
@PropertySource("classpath:messages.properties")
public class ProfilesController {

    @Autowired
    private ProfilesDao profilesDao;

    @Autowired
    private HomeDao homeDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("options/optionsprofiles")
    public String profiles(Model model) {
        model.addAttribute("lists", profilesDao.findAll());
        return "optionsProfiles";
    }

    @GetMapping("options/profile/delete/{id}")
    public String delete(@PathVariable Long id) {
        profilesDao.deleteById(id);
        return "redirect:/options/optionsprofiles";
    }

    @GetMapping("options/profile/clear")
    public String clear() {
        profilesDao.deleteAll();
        return "redirect:/options/optionsprofiles";
    }

    @GetMapping("options/profile/add")
    public String add(Model model) {
        model.addAttribute("profileadd", new Profiles());
        return "profilesAdd";
    }

    @PostMapping("profileerror")
    public String profileserror(Model model) {
        model.addAttribute("profileadd", new Profiles());
        return "profilesError";
    }

 @PostMapping("profilesuccess")
    public String profilessucccess(Model model) {
        model.addAttribute("profileadd", new Profiles());
        return "profilesuccess";
    }

 @GetMapping("registration")
    public String registration(Model model) {
        model.addAttribute("profileadd", new Profiles());
        return "registration";
    }

    @GetMapping("remindpassword")
    public String redmindpassword(Model model) {
        return "remindPassword";
    }

    @PostMapping("reminderror")
    public String redminderror(Model model) {
        model.addAttribute("homeadd", new Home());
        model.addAttribute("lists", homeDao.findAll());
        return "remindError";
    }

    @GetMapping("remindsuccess")
    public String redmindsuccess(Model model) {
        model.addAttribute("homeadd", new Home());
        model.addAttribute("lists", homeDao.findAll());
        return "remindSuccess";
    }

    @PostMapping("options/profile/save")
    public String save(Profiles profile) {
        profile.setPassword(bCryptPasswordEncoder.encode(profile.getPassword()));
        profile.setDescription("Tworzenie");
        profile.setPermissions("Odczyt-Edycja-Zapis");
        profile.setType("USER");
        profile.setEnable(true);
        profilesDao.save(profile);
        return "redirect:/options/optionsprofiles";
    }

    @PostMapping("registration/save")
    public String registrationsave(Profiles profile) {
        profile.setPassword(bCryptPasswordEncoder.encode(profile.getPassword()));
        profile.setType("ADMIN");
        profile.setDescription("Rejestracja");
        profile.setPermissions("Odczyt-Edycja-Zapis");
        profile.setEnable(true);
        profilesDao.save(profile);
        return "profilesuccess";
    }

    @GetMapping("options/profile/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Profiles profile = profilesDao.findById(id).get();
        model.addAttribute("profileadd", profile);
        return "profilesAdd";
    }

    @GetMapping("options/profile/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Profiles profile = profilesDao.findById(id).get();
        model.addAttribute("profiledetails", profile);
        return "profilesDetails";
    }

    @GetMapping("options/profile/editadmin/{id}")
    public String editadmin(@PathVariable Long id, Model model) {
        Profiles profile = profilesDao.findById(id).get();
        model.addAttribute("profileadd", profile);
        return "profilesAddAdmin";
    }

    @PostMapping("options/profile/admin")
    public String saveadmin(Profiles profil) {
        profilesDao.save(profil);
        return "redirect:/options/optionsprofile";
    }
}
