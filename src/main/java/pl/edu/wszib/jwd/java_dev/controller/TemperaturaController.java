package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PropertySource("classpath:app.properties")
public class TemperaturaController {

    @Value("${temperatura.wstaw.tytul}")
    private String tytul;

    @GetMapping("temperatura_wstaw")
    public String wstawianieTemperatury(Model model) {


        String[][] colors = {
                {"red","blue","purple","teal"},
                {"black","orange", "yellow", "green"},
                {"gray","silver", "olive", "lime"},
                {"navy","lime", "aqua", "fuchsia"}
        };
        model.addAttribute("colors", colors);
        model.addAttribute("tytul", tytul);
        return "temperatura_wstaw";




    }

}
