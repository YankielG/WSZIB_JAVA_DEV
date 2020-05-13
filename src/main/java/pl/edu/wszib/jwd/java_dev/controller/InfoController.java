package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.dao.InfoDao;

@Controller
@PropertySource("classpath:messages.properties")
public class InfoController {

    @Autowired
    private InfoDao infoDao;

    @GetMapping("info")
    public String info(Model model){

        return "info";
    }
}
