package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.dao.ProfilDao;

@Controller
@PropertySource("classpath:messages.properties")
public class ProfilController {

    @Autowired
    private ProfilDao profilDao;

    @GetMapping("profil")
    public String profil(Model model){

        return "profil";
    }

}
