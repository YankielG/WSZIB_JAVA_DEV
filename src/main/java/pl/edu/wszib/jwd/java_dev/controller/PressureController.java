package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.PressureDao;
import pl.edu.wszib.jwd.java_dev.model.Pressure;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class PressureController {

    @Autowired
    private PressureDao pressureDao;

    @GetMapping("pressure")
    public String pressure(Model model) {
        List<Date> label = new ArrayList<>();
        List<Double> information1 = new ArrayList<>();
        List<Double> information2 = new ArrayList<>();
        List<Double> information3 = new ArrayList<>();

        Iterable<Pressure> wagas = pressureDao.findAll();
        for (Pressure x : wagas) {
            information1.add(x.getShrink());
            information2.add(x.getDiastole());
            information3.add(x.getPulses());
//            label.add(information1.size());
            label.add(x.getDate());
        }

        model.addAttribute("label", label);
        model.addAttribute("information1", information1);
        model.addAttribute("information2", information2);
        model.addAttribute("information3", information3);
        model.addAttribute("lists", pressureDao.findAll());
        return "pressure";
    }

    @GetMapping("pressure/delete/{id}")
    public String delete(@PathVariable Long id) {
        pressureDao.deleteById(id);
        return "redirect:/pressure";
    }

    @GetMapping("pressure/clear")
    public String clear() {
        pressureDao.deleteAll();
        return "redirect:/pressure";
    }

    @GetMapping("pressure/add")
    public String add(Model model) {
        model.addAttribute("pressureadd", new Pressure());
        return "pressureAdd";
    }

    @PostMapping("pressure/save")
    public String save(Pressure pressure) {
        pressureDao.save(pressure);
        return "redirect:/pressure";
    }

    @GetMapping("pressure/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Pressure pressure = pressureDao.findById(id).get();
        model.addAttribute("pressureadd", pressure);
        return "pressureAdd";
    }

    @GetMapping("pressure/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Pressure pressure = pressureDao.findById(id).get();
        model.addAttribute("pressuredetails", pressure);
        return "pressureDetails";
    }

}
