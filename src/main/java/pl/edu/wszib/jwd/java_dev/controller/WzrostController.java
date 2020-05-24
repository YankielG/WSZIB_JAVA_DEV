package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.WzrostDao;
import pl.edu.wszib.jwd.java_dev.model.Waga;
import pl.edu.wszib.jwd.java_dev.model.Wzrost;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class WzrostController {

    @Autowired
    private WzrostDao wzrostDao;

    @GetMapping("wzrost")
    public String wzrost(Model model) {
        List<Date> etykieta = new ArrayList<>();
        List<Double> dane = new ArrayList<>();

        Iterable<Wzrost> wagas = wzrostDao.findAll();
        for (Wzrost x : wagas) {
            dane.add(x.getWzrost_());
//            etykieta.add(dane.size());
            etykieta.add(x.getData());
        }

        model.addAttribute("etykieta", etykieta);
        model.addAttribute("dane", dane);
        model.addAttribute("lista", wzrostDao.findAll());
        return "wzrost";
    }

    @GetMapping("wzrost/usun/{id}")
    public String usun(@PathVariable Long id) {
        wzrostDao.deleteById(id);
        return "redirect:/wzrost";
    }

    @GetMapping("wzrost/czysc")
    public String czysc() {
        wzrostDao.deleteAll();
        return "redirect:/wzrost";
    }

    @GetMapping("wzrost/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("wzrostdodaj", new Wzrost());
        return "wzrostdodaj";
    }

    @PostMapping("wzrost/zapisz")
    public String zapisz(Wzrost wzrost) {
        wzrostDao.save(wzrost);
        return "redirect:/wzrost";
    }

    @GetMapping("wzrost/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Wzrost wzrost = wzrostDao.findById(id).get();
        model.addAttribute("wzrostdodaj", wzrost);
        return "wzrostdodaj";
    }

    @GetMapping("wzrost/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Wzrost wzrost = wzrostDao.findById(id).get();
        model.addAttribute("wzrostszczegoly", wzrost);
        return "wzrostszczegoly";
    }
}
