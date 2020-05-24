package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.CisnienieDao;
import pl.edu.wszib.jwd.java_dev.model.Cisnienie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class CisnienieController {

    @Autowired
    private CisnienieDao cisnienieDao;

    @GetMapping("cisnienie")
    public String cisnienie(Model model) {
        List<Date> etykieta = new ArrayList<>();
        List<Double> dane = new ArrayList<>();

        Iterable<Cisnienie> wagas = cisnienieDao.findAll();
        for (Cisnienie x : wagas) {
            dane.add(x.getSkurcz());
//            etykieta.add(dane.size());
            etykieta.add(x.getData());
        }

        model.addAttribute("etykieta", etykieta);
        model.addAttribute("dane", dane);
        model.addAttribute("lista", cisnienieDao.findAll());
        return "cisnienie";
    }

    @GetMapping("cisnienie/usun/{id}")
    public String usun(@PathVariable Long id) {
        cisnienieDao.deleteById(id);
        return "redirect:/cisnienie";
    }

    @GetMapping("cisnienie/czysc")
    public String czysc() {
        cisnienieDao.deleteAll();
        return "redirect:/cisnienie";
    }

    @GetMapping("cisnienie/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("cisnieniedodaj", new Cisnienie());
        return "cisnieniedodaj";
    }

    @PostMapping("cisnienie/zapisz")
    public String zapisz(Cisnienie cisnienie) {
        cisnienieDao.save(cisnienie);
        return "redirect:/cisnienie";
    }

    @GetMapping("cisnienie/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Cisnienie cisnienie = cisnienieDao.findById(id).get();
        model.addAttribute("cisnieniedodaj", cisnienie);
        return "cisnieniedodaj";
    }

    @GetMapping("cisnienie/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Cisnienie cisnienie = cisnienieDao.findById(id).get();
        model.addAttribute("cisnienieszczegoly", cisnienie);
        return "cisnienieszczegoly";
    }

}
