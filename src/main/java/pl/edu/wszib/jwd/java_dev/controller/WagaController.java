package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.jwd.java_dev.dao.WagaDao;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Controller
@PropertySource("classpath:messages.properties")
public class WagaController {

    @Autowired
    private WagaDao wagaDao;

    @GetMapping("waga")
    public String waga(Model model) {
        model.addAttribute("lista", wagaDao.findAll());
        return "waga";
    }

    @GetMapping("waga/usun/{id}")
    public String usun(@PathVariable Long id) {
        wagaDao.deleteById(id);
        return "redirect:/waga";
    }

    @GetMapping("waga/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("wstaw", new Waga());
        return "wagawstaw";
    }


    @GetMapping("waga/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model){
        Waga waga = wagaDao.findById(id).get();
        model.addAttribute("element", waga);
        return "waga";
    }
}
