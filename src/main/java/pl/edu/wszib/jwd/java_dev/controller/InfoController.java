package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.InfoDao;
import pl.edu.wszib.jwd.java_dev.model.Info;

@Controller
@PropertySource("classpath:messages.properties")
public class InfoController {

    @Autowired
    private InfoDao infoDao;

    @GetMapping("info")
    public String info(Model model) {
        model.addAttribute("lista1", infoDao.findAll());
        return "info";
    }

    @GetMapping("opcje/info/usun/{id}")
    public String usun(@PathVariable Long id) {
        infoDao.deleteById(id);
        return "redirect:/opcje";
    }

    @GetMapping("opcje/info/czysc")
    public String czysc() {
        infoDao.deleteAll();
        return "redirect:/opcje";
    }

    @GetMapping("opcje/info/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("infododaj", new Info());
        return "infododaj";
    }

    @PostMapping("opcje/info/zapisz")
    public String zapisz(Info info) {
        infoDao.save(info);
        return "redirect:/opcje";
    }

    @GetMapping("opcje/info/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Info info = infoDao.findById(id).get();
        model.addAttribute("infododaj", info);
        return "infododaj";
    }
}
