package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@PropertySource("classpath:messages.properties")
public class Error404Controller {

@GetMapping("/error404")
    public String error404(){
        return "error404";
    }
}
