package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.dao.WagaDao;

@Controller
@PropertySource("classpath:messages.properties")
public class WagaController {

    @Autowired
    private WagaDao wagaDao;

    @GetMapping("waga")
    public String waga(Model model) {
model.addAttribute("wagalista",wagaDao.findAll());
        return "waga";
    }
}
