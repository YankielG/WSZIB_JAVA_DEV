package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.InfoDao;
import pl.edu.wszib.jwd.java_dev.model.Info;

@Controller
@PropertySource("classpath:messages.properties")
public class InfoController {

    @Autowired
    private InfoDao infoDao;

    @GetMapping("info")
    public String info(Model model) {
        model.addAttribute("lists", infoDao.findAll());
        return "info";
    }

    @GetMapping("options/optionsinfo")
    public String optionsinfo(Model model) {
        model.addAttribute("lists1", infoDao.findAll());
        return "optionsInfo";
    }

    @GetMapping("options/info/delete/{id}")
    public String delete(@PathVariable Long id) {
        infoDao.deleteById(id);
        return "redirect:/options/optionsinfo";
    }

    @GetMapping("options/info/clear")
    public String clear() {
        infoDao.deleteAll();
        return "redirect:/options/optionsinfo";
    }

    @GetMapping("options/info/add")
    public String add(Model model) {
        model.addAttribute("infoadd", new Info());
        return "infoAdd";
    }

    @PostMapping("options/info/save")
    public String save(Info info) {
        infoDao.save(info);
        return "redirect:/options/optionsinfo";
    }

    @GetMapping("options/info/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Info info = infoDao.findById(id).get();
        model.addAttribute("infoadd", info);
        return "infoAdd";
    }

    @GetMapping("options/info/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Info info = infoDao.findById(id).get();
        model.addAttribute("infodetails", info);
        return "infoDetails";
    }
}
