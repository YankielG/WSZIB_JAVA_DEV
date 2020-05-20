package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.NawykiDao;
import pl.edu.wszib.jwd.java_dev.model.Nawyki;

@Controller
@PropertySource("classpath:messages.properties")
public class NawykiController {

    @Autowired
    private NawykiDao nawykiDao;

    @GetMapping("nawyki")
    public String nawyki(Model model) {
        model.addAttribute("lista", nawykiDao.findAll());
        return "nawyki";
    }

    @GetMapping("nawyki/usun/{id}")
    public String usun(@PathVariable Long id) {
        nawykiDao.deleteById(id);
        return "redirect:/nawyki";
    }

    @GetMapping("nawyki/czysc")
    public String czysc() {
        nawykiDao.deleteAll();
        return "redirect:/nawyki";
    }

    @GetMapping("nawyki/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("nawykidodaj", new Nawyki());
        return "nawykidodaj";
    }

    @PostMapping("nawyki/zapisz")
    public String zapisz(Nawyki nawyki) {
        nawykiDao.save(nawyki);
        return "redirect:/nawyki";
    }

    @GetMapping("nawyki/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Nawyki nawyki = nawykiDao.findById(id).get();
        model.addAttribute("nawykidodaj", nawyki);
        return "nawykidodaj";
    }

    @GetMapping("nawyki/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Nawyki nawyki = nawykiDao.findById(id).get();
        model.addAttribute("nawykiszczegoly", nawyki);
        return "nawykiszczegoly";
    }
}
