package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.PulseDao;
import pl.edu.wszib.jwd.java_dev.model.Pulse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@PropertySource("classpath:messages.properties")
public class PulseController {

    @Autowired
    private PulseDao pulseDao;

    @GetMapping("pulse")
    public String pulse(Model model) {
        List<Date> label = new ArrayList<>();
        List<Double> information = new ArrayList<>();

        Iterable<Pulse> wagas = pulseDao.findAll();
        for (Pulse x : wagas) {
            information.add(x.getPulses());
//            label.add(information.size());
            label.add(x.getDate());
        }

        model.addAttribute("label", label);
        model.addAttribute("information", information);
        model.addAttribute("lists", pulseDao.findAll());
        return "pulse";
    }

    @GetMapping("pulse/delete/{id}")
    public String delete(@PathVariable Long id) {
        pulseDao.deleteById(id);
        return "redirect:/pulse";
    }

    @GetMapping("pulse/clear")
    public String clear() {
        pulseDao.deleteAll();
        return "redirect:/pulse";
    }

    @GetMapping("pulse/add")
    public String add(Model model) {
        model.addAttribute("pulseadd", new Pulse());
        return "pulseAdd";
    }

    @PostMapping("pulse/save")
    public String save(Pulse pulse) {
        pulseDao.save(pulse);
        return "redirect:/pulse";
    }

    @GetMapping("pulse/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Pulse pulse = pulseDao.findById(id).get();
        model.addAttribute("pulseadd", pulse);
        return "pulseAdd";
    }

    @GetMapping("pulse/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Pulse pulse = pulseDao.findById(id).get();
        model.addAttribute("pulsedetails", pulse);
        return "pulseDetails";
    }
}
