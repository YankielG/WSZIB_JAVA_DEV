package pl.edu.wszib.jwd.java_dev.controller;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wszib.jwd.java_dev.dao.Error404Dao;

@ControllerAdvice
//@RestController
//@Controller
@PropertySource("classpath:messages.properties")
public class Error404Controller extends Throwable {

    @Autowired
    private Error404Dao error404Dao;

    @GetMapping("error404")
    public String error404(Model model){

        return "error404";
    }

    @ExceptionHandler(NotFoundException.class)
    public String error(){

        return "error404";
    }
}
