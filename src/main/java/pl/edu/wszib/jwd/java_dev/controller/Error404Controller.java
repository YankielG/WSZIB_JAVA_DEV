package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wszib.jwd.java_dev.dao.Error404Dao;

@RestController
//@Controller
@PropertySource("classpath:messages.properties")
public class Error404Controller {

    @Autowired
    private Error404Dao error404Dao;

    @GetMapping("error404")
    public String error404(Model model){

        return "error404";
    }
}
