package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.StartDao;
import pl.edu.wszib.jwd.java_dev.model.Start;

@Controller
@PropertySource("classpath:messages.properties")
public class  StartController {

    @Autowired
    private StartDao startDao;

//    @GetMapping
//    public String start(Model model){
//        return "start";
//    }

    @GetMapping
    public String wstaw(Model model){
        model.addAttribute("startdodaj", new Start());
        return "start";
    }

    @PostMapping("start/zapisz")
    public String zapisz(Start start){
        startDao.save(start);
        return "redirect:/index";
    }
}



