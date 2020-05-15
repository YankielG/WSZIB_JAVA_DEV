package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.dao.TentnoDao;

@Controller
@PropertySource("classpath:messages.properties")
public class TentnoController {

    @Autowired
    private TentnoDao tentnoDao;

    @GetMapping("tentno")
    public String tentno(Model model){

        return "tentno";
    }
}