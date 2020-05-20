package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.StartDao;
import pl.edu.wszib.jwd.java_dev.model.Start;
import pl.edu.wszib.jwd.java_dev.model.Start;

@Controller
@PropertySource("classpath:messages.properties")
public class StartController {

    @Autowired
    private StartDao startDao;

    //    @GetMapping
//    public String start(Model model){
//    model.addAttribute("lista", startDao.findAll());
//        return "start";
//    }

    @GetMapping("start/usun/{id}")
    public String usun(@PathVariable Long id) {
        startDao.deleteById(id);
        return "redirect:/start";
    }

    @GetMapping("start/czysc")
    public String czysc() {
        startDao.deleteAll();
        return "redirect:/start";
    }

    @GetMapping
    public String wstaw(Model model) {
        model.addAttribute("startdodaj", new Start());
            model.addAttribute("lista", startDao.findAll());
        return "start";
    }

    @PostMapping("start/zapisz")
    public String zapisz(Start start) {
        startDao.save(start);
        return "redirect:/index";
    }

    @GetMapping("start/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Start start = startDao.findById(id).get();
        model.addAttribute("startdodaj", start);
        return "startdodaj";
    }

//    @GetMapping("/{id}")
//    public String edytuj1(@PathVariable Long id, Model model) {
//        Start start = startDao.findById(id).get();
//        model.addAttribute("startdodaj", start);
//        return "startdodaj";
//    }

}



