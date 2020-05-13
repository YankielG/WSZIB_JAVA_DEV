package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.dao.WzrostDao;

@Controller
@PropertySource("classpath:messages.properties")
public class WzrostController {

    @Autowired
    private WzrostDao wzrostDao;

    @GetMapping("wzrost")
    public String wzrost(Model model){

        return "wzrost";
    }
}
