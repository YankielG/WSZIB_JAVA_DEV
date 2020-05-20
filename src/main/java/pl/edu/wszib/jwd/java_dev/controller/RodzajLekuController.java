package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.RodzajLekuDao;
import pl.edu.wszib.jwd.java_dev.model.RodzajLeku;

@Controller
@PropertySource("classpath:messages.properties")
public class RodzajLekuController {

    @Autowired
    private RodzajLekuDao rodzajLekuDao;

    @GetMapping("opcje/rodzajleku")
    public String rodzajleku(Model model) {
        model.addAttribute("lista", rodzajLekuDao.findAll());
        return "opcjeleki";
    }

    @GetMapping("opcje/rodzajleku/usun/{id}")
    public String usun(@PathVariable Long id) {
        rodzajLekuDao.deleteById(id);
        return "redirect:/opcje/rodzajleku";
    }

    @GetMapping("opcje/rodzajleku/czysc")
    public String czysc() {
        rodzajLekuDao.deleteAll();
        return "redirect:/opcje/rodzajleku";
    }

    @GetMapping("opcje/rodzajleku/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("rodzajlekudodaj", new RodzajLeku());
        return "rodzajlekudodaj";
    }

    @PostMapping("opcje/rodzajleku/zapisz")
    public String zapisz(RodzajLeku rodzajLeku) {
        rodzajLekuDao.save(rodzajLeku);
        return "redirect:/opcje/rodzajleku";
    }

    @GetMapping("opcje/rodzajleku/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        RodzajLeku rodzajleku = rodzajLekuDao.findById(id).get();
        model.addAttribute("rodzajlekudodaj", rodzajleku);
        return "rodzajlekudodaj";
    }

    @GetMapping("opcje/rodzajleku/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        RodzajLeku rodzajleku = rodzajLekuDao.findById(id).get();
        model.addAttribute("rodzajlekuszczegoly", rodzajleku);
        return "rodzajlekuszczegoly";
    }
}
