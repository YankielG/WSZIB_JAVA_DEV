package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.TemperatureDao;
import pl.edu.wszib.jwd.java_dev.model.Temperature;

import java.util.*;

@Controller
@PropertySource("classpath:messages.properties")
public class TemperatureController {

    @Autowired
    private TemperatureDao temperatureDao;

    @GetMapping("temperature")
    public String temperature(Model model) {
        List<Date> label = new ArrayList<>();
        List<Double> information = new ArrayList<>();

        Iterable<Temperature> temperatures = temperatureDao.findAll();
        for (Temperature x  : temperatures) {
            information.add(x.getTemperatures());
//            label.add(information.size());
            label.add(x.getDate());
        }

        model.addAttribute("label", label);
        model.addAttribute("information", information);
        model.addAttribute("lists", temperatureDao.findAll());
        return "temperature";
    }

    @GetMapping("temperature/delete/{id}")
    public String delete(@PathVariable Long id) {
        temperatureDao.deleteById(id);
        return "redirect:/temperature";
    }

    @GetMapping("temperature/clear")
    public String clear() {
        temperatureDao.deleteAll();
        return "redirect:/temperature";
    }

    @GetMapping("temperature/add")
    public String add(Model model) {
        model.addAttribute("temperatureadd", new Temperature());
        return "temperatureadd";
    }

    @PostMapping("temperature/save")
    public String save(Temperature temperature) {
        temperatureDao.save(temperature);
        return "redirect:/temperature";
    }

    @GetMapping("temperature/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Temperature temperature = temperatureDao.findById(id).get();
        model.addAttribute("temperatureadd", temperature);
        return "temperatureAdd";
    }

    @GetMapping("temperature/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Temperature temperature = temperatureDao.findById(id).get();
        model.addAttribute("temperaturedetails", temperature);
        return "temperatureDetails";
    }

}
