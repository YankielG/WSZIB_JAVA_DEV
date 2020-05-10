package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.dao.TemperaturaDao;

@Controller
@PropertySource("classpath:messages.properties")
public class TemperaturaController {

    @Autowired
    TemperaturaDao temperaturaDao;

    @Value("${temperatura.wstaw.tytul}")
    private String tytul;

    @GetMapping("temperatura_wstaw")
    public String wstawianieTemperatury(Model model) {
        model.addAttribute("tytul", tytul);
        return "temperatura_wstaw";
    }
}
