package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.TetnoDao;
import pl.edu.wszib.jwd.java_dev.model.Tetno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class TetnoController {

    @Autowired
    private TetnoDao tetnoDao;

    @GetMapping("tetno")
    public String tentno(Model model) {
        List<Date> etykieta = new ArrayList<>();
        List<Double> dane = new ArrayList<>();

        Iterable<Tetno> wagas = tetnoDao.findAll();
        for (Tetno x : wagas) {
            dane.add(x.getTetnoo());
//            etykieta.add(dane.size());
            etykieta.add(x.getData());
        }

        model.addAttribute("etykieta", etykieta);
        model.addAttribute("dane", dane);
        model.addAttribute("lista", tetnoDao.findAll());
        return "tetno";
    }

    @GetMapping("tetno/usun/{id}")
    public String usun(@PathVariable Long id) {
        tetnoDao.deleteById(id);
        return "redirect:/tetno";
    }

    @GetMapping("tetno/czysc")
    public String czysc() {
        tetnoDao.deleteAll();
        return "redirect:/tetno";
    }

    @GetMapping("tetno/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("tetnododaj", new Tetno());
        return "tetnododaj";
    }

    @PostMapping("tetno/zapisz")
    public String zapisz(Tetno tetno) {
        tetnoDao.save(tetno);
        return "redirect:/tetno";
    }

    @GetMapping("tetno/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Tetno tetno = tetnoDao.findById(id).get();
        model.addAttribute("tetnododaj", tetno);
        return "tetnododaj";
    }

    @GetMapping("tetno/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Tetno tetno = tetnoDao.findById(id).get();
        model.addAttribute("tetnoszczegoly", tetno);
        return "tetnoszczegoly";
    }
}
