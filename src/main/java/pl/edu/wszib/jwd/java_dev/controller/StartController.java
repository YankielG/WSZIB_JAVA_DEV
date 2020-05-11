package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PropertySource("classpath:messages.properties")
public class  StartController {

    @GetMapping
    public String start(){
        return "start";
    }


}



