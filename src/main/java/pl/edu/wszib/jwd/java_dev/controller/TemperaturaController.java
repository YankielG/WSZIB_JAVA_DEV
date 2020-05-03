package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemperaturaController {

    @GetMapping("temperatura_wstaw")
    public String wstawianieTemperatury (){
        return "temperatura_wstaw";
    }

}
