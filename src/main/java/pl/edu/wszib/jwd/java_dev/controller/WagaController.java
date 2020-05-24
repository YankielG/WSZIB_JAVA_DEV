package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.jwd.java_dev.dao.WagaDao;
import pl.edu.wszib.jwd.java_dev.model.Waga;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class WagaController {

    @Autowired
    private WagaDao wagaDao;

    @GetMapping("waga")
    public String waga(Model model) {
        List<Date> etykieta = new ArrayList<>();
        List<Double> dane = new ArrayList<>();

        Iterable<Waga> wagas = wagaDao.findAll();
        for (Waga x : wagas) {
            dane.add(x.getWagaa());
//            etykieta.add(dane.size());
            etykieta.add(x.getData());
        }

        model.addAttribute("etykieta", etykieta);
        model.addAttribute("dane", dane);
        model.addAttribute("lista", wagaDao.findAll());
        return "waga";
    }


//    @GetMapping("waga")
//    public ModelMap waga(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
////        if (id != null) {
////
////            return new ModelMap().addAttribute("lista", wagaDao.findAllById(id, pageable));
////        } else {
////            return new ModelMap().addAttribute("lista", wagaDao.findAll(pageable));
////        }
////        return new ModelMap().addAttribute("lista", wagaDao.findAll(pageable));
//
//        List<Date> etykieta = new ArrayList<>();
//        List<Double> dane = new ArrayList<>();
//
//        Iterable<Waga> wagas = wagaDao.findAll();
//
//        for (Waga t  : wagas) {
//            dane.add(t.getWagaa());
////            etykieta.add(dane.size());
//            etykieta.add(t.getData());
//        }
//
//        model.addAttribute("etykieta", etykieta);
//        model.addAttribute("dane", dane);
//
//        return "waga";
//
//    }


    @GetMapping("waga/usun/{id}")
    public String usun(@PathVariable Long id) {
        wagaDao.deleteById(id);
        return "redirect:/waga";
    }

    @GetMapping("waga/czysc")
    public String czysc() {
        wagaDao.deleteAll();
        return "redirect:/waga";
    }

    @GetMapping("waga/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("wagadodaj", new Waga());
        return "wagadodaj";
    }

    @PostMapping("waga/zapisz")
    public String zapisz(Waga waga) {
        wagaDao.save(waga);
        return "redirect:/waga";
    }

    @GetMapping("waga/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Waga waga = wagaDao.findById(id).get();
        model.addAttribute("wagadodaj", waga);
        return "wagadodaj";
    }

    @GetMapping("waga/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Waga waga = wagaDao.findById(id).get();
        model.addAttribute("wagaszczegoly", waga);
        return "wagaszczegoly";
    }
}
