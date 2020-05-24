package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.TemperaturaDao;
import pl.edu.wszib.jwd.java_dev.model.Temperatura;

import java.util.*;
import java.util.stream.Collectors;

@Controller
@PropertySource("classpath:messages.properties")
public class TemperaturaController {

    @Autowired
    private TemperaturaDao temperaturaDao;

    @GetMapping("temperatura")
    public String Temperatura(Model model) {
        List<Date> etykieta = new ArrayList<>();
        List<Double> dane = new ArrayList<>();

        Iterable<Temperatura> temperaturas = temperaturaDao.findAll();
        for (Temperatura x  : temperaturas) {
            dane.add(x.getTemp());
//            etykieta.add(dane.size());
            etykieta.add(x.getData());
        }

        model.addAttribute("etykieta", etykieta);
        model.addAttribute("dane", dane);
        model.addAttribute("lista", temperaturaDao.findAll());
        return "temperatura";
    }

    @GetMapping("temperatura/usun/{id}")
    public String usun(@PathVariable Long id) {
        temperaturaDao.deleteById(id);
        return "redirect:/temperatura";
    }

    @GetMapping("temperatura/czysc")
    public String czysc() {
        temperaturaDao.deleteAll();
        return "redirect:/temperatura";
    }

    @GetMapping("temperatura/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("temperaturadodaj", new Temperatura());
        return "temperaturadodaj";
    }

    @PostMapping("temperatura/zapisz")
    public String zapisz(Temperatura temperatura) {
        temperaturaDao.save(temperatura);
        return "redirect:/temperatura";
    }

    @GetMapping("temperatura/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Temperatura temperatura = temperaturaDao.findById(id).get();
        model.addAttribute("temperaturadodaj", temperatura);
        return "temperaturadodaj";
    }

    @GetMapping("temperatura/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Temperatura temperatura = temperaturaDao.findById(id).get();
        model.addAttribute("temperaturaszczegoly", temperatura);
        return "temperaturaszczegoly";
    }

}
