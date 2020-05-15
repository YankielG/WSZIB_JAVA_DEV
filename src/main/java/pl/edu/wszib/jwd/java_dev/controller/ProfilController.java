package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.InfoDao;
import pl.edu.wszib.jwd.java_dev.dao.ProfilDao;
import pl.edu.wszib.jwd.java_dev.dao.RodzajLekuDao;
import pl.edu.wszib.jwd.java_dev.model.Profil;

@Controller
@PropertySource("classpath:messages.properties")
public class ProfilController {

    @Autowired
    private ProfilDao profilDao;

    @Autowired
    private InfoDao infoDao;

    @Autowired
    private RodzajLekuDao rodzajLekuDao;

    @GetMapping("opcje")
    public String profil(Model model) {
        model.addAttribute("lista2", profilDao.findAll());
        model.addAttribute("lista1",infoDao.findAll());
        model.addAttribute("lista3", rodzajLekuDao.findAll());
        return "opcje";
    }

    @GetMapping("opcje/profil/usun/{id}")
    public String usun(@PathVariable Long id) {
        profilDao.deleteById(id);
        return "redirect:/opcje";
    }

    @GetMapping("opcje/profil/czysc")
    public String czysc() {
        profilDao.deleteAll();
        return "redirect:/opcje";
    }

    @GetMapping("opcje/profil/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("profildodaj", new Profil());
        return "profildodaj";
    }

    @PostMapping("opcje/profil/zapisz")
    public String zapisz(Profil profil) {
        profilDao.save(profil);
        return "redirect:/opcje";
    }

    @GetMapping("opcje/profil/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Profil profil = profilDao.findById(id).get();
        model.addAttribute("profildodaj", profil);
        return "profildodaj";
    }
}
