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
import pl.edu.wszib.jwd.java_dev.dao.BowDao;
import pl.edu.wszib.jwd.java_dev.dao.BowTypeDao;
import pl.edu.wszib.jwd.java_dev.model.Bow;

@Controller
@PropertySource("classpath:messages.properties")
public class BowController {

    @Autowired
    private BowDao bowDao;

    @Autowired
    private BowTypeDao bowTypeDao;

    @GetMapping("bow")
    public ModelMap bows(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
        return new ModelMap().addAttribute("lists", bowDao.findAll(pageable));
    }

    @GetMapping("bow/delete/{id}")
    public String delete(@PathVariable Long id) {
        bowDao.deleteById(id);
        return "redirect:/bow";
    }

    @GetMapping("bow/clear")
    public String clear() {
        bowDao.deleteAll();
        return "redirect:/bow";
    }

    @GetMapping("bow/add")
    public String add(Model model) {
        model.addAttribute("bowadd", new Bow());
        model.addAttribute("bowtypeadd", bowTypeDao.findAll());
        return "bowAdd";
    }

    @PostMapping("bow/save")
    public String save(Bow bow) {
        bowDao.save(bow);
        return "redirect:/bow";
    }

    @GetMapping("bow/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Bow bow = bowDao.findById(id).get();
        model.addAttribute("bowadd", bow);
        model.addAttribute("bowtypeadd", bowTypeDao.findAll());
        return "bowAdd";
    }

    @GetMapping("bow/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Bow bow = bowDao.findById(id).get();
        model.addAttribute("bowdetails", bow);
        model.addAttribute("bowtypeadd", bowTypeDao.findAll());
        return "bowDetails";
    }
}
