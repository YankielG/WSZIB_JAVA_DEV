package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwd.java_dev.Model.Temperatura;
import pl.edu.wszib.jwd.java_dev.dao.TemperaturaDao;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Controller
@PropertySource("classpath:app.properties")
public class TemperaturaController {

    @Autowired
    TemperaturaDao temperaturaDao;


    @Value("${temperatura.wstaw.tytul}")
    private String tytul;

//    @GetMapping("temperatura_wstaw")
//    public String wstawianieTemperatury(Model model) {
//        model.addAttribute("tytul", tytul);
//        return "temperatura_wstaw";
//    }


    @GetMapping("temperatura_wstaw")
    public String wstawianieTemperatury(Model model) {
        Iterable<Temperatura> temperatura = temperaturaDao.findAll();
        Collection<Temperatura> temperaturaCollection
                = (Collection<Temperatura>) temperatura;
//        Map<long> wykres = temperaturaCollection.stream()
//                .collect(Collectors.groupingBy(Temperatura::getTemperatura));
        model.addAttribute("temperatura", temperatura);
        model.addAttribute("tytul", tytul);
        return "temperatura_wstaw";


    }

}
