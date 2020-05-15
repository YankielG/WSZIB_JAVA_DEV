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

@Controller
@PropertySource("classpath:messages.properties")
public class TetnoController {

    @Autowired
    private TetnoDao tetnoDao;

    @GetMapping("tetno")
    public String tentno(Model model) {
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
}
