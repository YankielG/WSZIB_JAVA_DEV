package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.IndexDao;
import pl.edu.wszib.jwd.java_dev.dao.StartDao;
import pl.edu.wszib.jwd.java_dev.model.Index;
import pl.edu.wszib.jwd.java_dev.model.Start;

@Controller
@PropertySource("classpath:messages.properties")
public class IndexController {

    @Autowired
    private IndexDao indexDao;

    @Autowired
    private StartDao startDao;

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("lista", startDao.findAll());
        model.addAttribute("lista1", indexDao.findAll());
        return "index";
    }

    @GetMapping("index/usun/{id}")
    public String usun(@PathVariable Long id) {
        indexDao.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("index/czysc")
    public String czysc() {
        indexDao.deleteAll();
        return "redirect:/index";
    }

    @GetMapping("index/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("indexdodaj", new Index());
        return "indexdodaj";
    }

    @PostMapping("index/zapisz")
    public String zapisz(Index index) {
        indexDao.save(index);
        return "redirect:/index";
    }

    @GetMapping("index/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Index index = indexDao.findById(id).get();
        model.addAttribute("indexdodaj", index);
        return "indexdodaj";
    }

    @GetMapping("index/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Index index = indexDao.findById(id).get();
        model.addAttribute("indexszczegoly", index);
        return "indexszczegoly";
    }
}


