package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.WeightDao;
import pl.edu.wszib.jwd.java_dev.model.Weight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class WeightController {

    @Autowired
    private WeightDao weightDao;

    @GetMapping("weight")
    public String weight(Model model) {
        List<Date> label = new ArrayList<>();
        List<Double> information = new ArrayList<>();

        Iterable<Weight> weights = weightDao.findAll();
        for (Weight x : weights) {
            information.add(x.getWeights());
//            label.add(information.size());
            label.add(x.getDate());
        }

        model.addAttribute("label", label);
        model.addAttribute("information", information);
        model.addAttribute("lists", weightDao.findAll());
        return "weight";
    }

    @GetMapping("weight/delete/{id}")
    public String delete(@PathVariable Long id) {
        weightDao.deleteById(id);
        return "redirect:/weight";
    }

    @GetMapping("weight/clear")
    public String clear() {
        weightDao.deleteAll();
        return "redirect:/weight";
    }

    @GetMapping("weight/add")
    public String add(Model model) {
        model.addAttribute("weightadd", new Weight());
        return "weightAdd";
    }

    @PostMapping("weight/save")
    public String save(Weight weight) {
        weightDao.save(weight);
        return "redirect:/weight";
    }

    @GetMapping("weight/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Weight weight = weightDao.findById(id).get();
        model.addAttribute("weightadd", weight);
        return "weightAdd";
    }

    @GetMapping("weight/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Weight weight = weightDao.findById(id).get();
        model.addAttribute("weightdetails", weight);
        return "weightDetails";
    }
}
