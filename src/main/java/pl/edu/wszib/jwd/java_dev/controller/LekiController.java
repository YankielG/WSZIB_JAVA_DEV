package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.LekiDao;
import pl.edu.wszib.jwd.java_dev.dao.RodzajLekuDao;
import pl.edu.wszib.jwd.java_dev.model.Leki;

@Controller
@PropertySource("classpath:messages.properties")
public class LekiController {

    @Autowired
    private LekiDao lekiDao;

    @Autowired
    private RodzajLekuDao rodzajLekuDao;

    @GetMapping("leki")
    public String leki(Model model) {
        model.addAttribute("lista", lekiDao.findAll());
        return "leki";
    }

    @GetMapping("leki/usun/{id}")
    public String usun(@PathVariable Long id) {
        lekiDao.deleteById(id);
        return "redirect:/leki";
    }

    @GetMapping("leki/czysc")
    public String czysc() {
        lekiDao.deleteAll();
        return "redirect:/leki";
    }

    @GetMapping("leki/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("lekidodaj", new Leki());
        model.addAttribute("rodajkekudodaj", rodzajLekuDao.findAll());
        return "lekidodaj";
    }

    @PostMapping("leki/zapisz")
    public String zapisz(Leki leki) {
        lekiDao.save(leki);
        return "redirect:/leki";
    }

    @GetMapping("leki/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Leki leki = lekiDao.findById(id).get();
        model.addAttribute("lekidodaj", leki);
        model.addAttribute("rodajkekudodaj", rodzajLekuDao.findAll());
        return "lekidodaj";
    }

    @GetMapping("leki/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Leki leki = lekiDao.findById(id).get();
        model.addAttribute("lekiszczegoly", leki);
        model.addAttribute("rodajkekudodaj", rodzajLekuDao.findAll());
        return "lekiszczegoly";
    }
}
