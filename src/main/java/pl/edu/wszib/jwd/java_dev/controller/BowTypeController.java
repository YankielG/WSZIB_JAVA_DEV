package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.BowTypeDao;
import pl.edu.wszib.jwd.java_dev.model.BowType;

@Controller
@PropertySource("classpath:messages.properties")
public class BowTypeController {

    @Autowired
    private BowTypeDao bowtypeDao;

    @GetMapping("options/optionsbow")
    public String bowtype(Model model) {
        model.addAttribute("lists", bowtypeDao.findAll());
        return "optionsBow";
    }

    @GetMapping("options/bowtype/delete/{id}")
    public String delete(@PathVariable Long id) {
        bowtypeDao.deleteById(id);
        return "redirect:/options/optionsbow";
    }

    @GetMapping("options/bowtype/clear")
    public String clear() {
        bowtypeDao.deleteAll();
        return "redirect:/options/optionsbow";
    }

    @GetMapping("options/bowtype/add")
    public String add(Model model) {
        model.addAttribute("bowtypeadd", new BowType());
        return "bowTypeAdd";
    }

    @PostMapping("options/bowtype/save")
    public String save(BowType bowtype) {
        bowtypeDao.save(bowtype);
        return "redirect:/options/optionsbow";
    }

    @GetMapping("options/bowtype/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        BowType bowtype = bowtypeDao.findById(id).get();
        model.addAttribute("bowtypeadd", bowtype);
        return "bowTypeAdd";
    }

    @GetMapping("options/bowtype/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        BowType bowtype = bowtypeDao.findById(id).get();
        model.addAttribute("bowtypedetails", bowtype);
        return "bowTypeDetails";
    }
}
