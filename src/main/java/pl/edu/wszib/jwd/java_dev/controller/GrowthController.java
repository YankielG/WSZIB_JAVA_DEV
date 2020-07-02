package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.GrowthDao;
import pl.edu.wszib.jwd.java_dev.model.Growth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class GrowthController {

    @Autowired
    private GrowthDao growthDao;

    @GetMapping("growth")
    public String growth(Model model) {
        List<Date> label = new ArrayList<>();
        List<Double> information = new ArrayList<>();

        Iterable<Growth> growths = growthDao.findAll();
        for (Growth x : growths) {
            information.add(x.getGrowths());
//            label.add(information.size());
            label.add(x.getDate());
        }

        model.addAttribute("label", label);
        model.addAttribute("information", information);
        model.addAttribute("lists", growthDao.findAll());
        return "growth";
    }

    @GetMapping("growth/delete/{id}")
    public String delete(@PathVariable Long id) {
        growthDao.deleteById(id);
        return "redirect:/growth";
    }

    @GetMapping("growth/clear")
    public String clear() {
        growthDao.deleteAll();
        return "redirect:/growth";
    }

    @GetMapping("growth/add")
    public String add(Model model) {
        model.addAttribute("growthadd", new Growth());
        return "growthAdd";
    }

    @PostMapping("growth/save")
    public String save(Growth growth) {
        growthDao.save(growth);
        return "redirect:/growth";
    }

    @GetMapping("growth/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Growth growth = growthDao.findById(id).get();
        model.addAttribute("growthadd", growth);
        return "growthAdd";
    }

    @GetMapping("growth/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Growth growth = growthDao.findById(id).get();
        model.addAttribute("growthdetails", growth);
        return "growthDetails";
    }
}
