package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.ProfilDao;
import pl.edu.wszib.jwd.java_dev.model.Profil;

@Controller
@PropertySource("classpath:messages.properties")
public class ProfilController {

    @Autowired
    private ProfilDao profilDao;

    @GetMapping("profil")
    public String profil(Model model) {
        model.addAttribute("lista", profilDao.findAll());
        return "profil";
    }

    @GetMapping("profil/usun/{id}")
    public String usun(@PathVariable Long id) {
        profilDao.deleteById(id);
        return "redirect:/profil";
    }

    @GetMapping("profil/czysc")
    public String czysc() {
        profilDao.deleteAll();
        return "redirect:/profil";
    }

    @GetMapping("profil/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("profildodaj", new Profil());
        return "profildodaj";
    }

    @PostMapping("profil/zapisz")
    public String zapisz(Profil profil) {
        profilDao.save(profil);
        return "redirect:/profil";
    }

    @GetMapping("profil/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Profil profil = profilDao.findById(id).get();
        model.addAttribute("profildodaj", profil);
        return "profildodaj";
    }
}
