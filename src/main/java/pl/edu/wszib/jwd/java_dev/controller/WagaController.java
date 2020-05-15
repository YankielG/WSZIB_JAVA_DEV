package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("waga/czysc")
    public String czysc() {
        wagaDao.deleteAll();
        return "redirect:/waga";
    }

    @GetMapping("waga/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("wagadodaj", new Waga());
        return "wagadodaj";
    }

    @PostMapping("waga/zapisz")
    public String zapisz(Waga waga){
        wagaDao.save(waga);
        return "redirect:/waga";
    }

    @GetMapping("waga/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model){
        Waga waga = wagaDao.findById(id).get();
        model.addAttribute("wagadodaj", waga);
        return "wagadodaj";
    }
}