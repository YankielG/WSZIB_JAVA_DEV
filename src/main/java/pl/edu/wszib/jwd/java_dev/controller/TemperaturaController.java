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
        model.addAttribute("lista", temperaturaDao.findAll());

        //Mikłas
        //double etykieta[]={1,2,3,4,5,6,7,8,9,10,11};
        //double dane[]={30, 35, 37, 37, 39, 41, 43, 36, 37, 34};

        List<Date> etykieta = new ArrayList<>();
        List<Double> dane = new ArrayList<>();

        Iterable<Temperatura> temperaturas = temperaturaDao.findAll();

        for (Temperatura t  : temperaturas) {
            dane.add(t.getTemp());
//            etykieta.add(dane.size());
            etykieta.add(t.getData());
        }

        model.addAttribute("etykieta", etykieta);
        model.addAttribute("dane", dane);

        //Iterable<Temperatura> temperaturas = temperaturaDao.findAll();
        //Collection<Temperatura> temperaturaCollection
        //        = (Collection<Temperatura>) temperaturas;


//
//        Map<String, Long> dataMap = temperaturaCollection.stream()
//                .collect(Collectors.groupingBy(Temperatura::getTemperatura, Collectors.counting()));
//
//        model.addAttribute("dataMap", dataMap);
//        model.addAttribute("labels", 2);
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
