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
import pl.edu.wszib.jwd.java_dev.dao.HabitsDao;
import pl.edu.wszib.jwd.java_dev.model.Habits;

@Controller
@PropertySource("classpath:messages.properties")
public class HabitsController {

    @Autowired
    private HabitsDao habitsDao;

    @GetMapping("habits")
    public ModelMap habit(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "id", required = false) Long id, Model model) {
        return new ModelMap().addAttribute("lists", habitsDao.findAll(pageable));
    }

    @GetMapping("habits/delete/{id}")
    public String delete(@PathVariable Long id) {
        habitsDao.deleteById(id);
        return "redirect:/habits";
    }

    @GetMapping("habits/clear")
    public String clear() {
        habitsDao.deleteAll();
        return "redirect:/habits";
    }

    @GetMapping("habits/add")
    public String add(Model model) {
        model.addAttribute("habitsadd", new Habits());
        return "habitsAdd";
    }

    @PostMapping("habits/save")
    public String save(Habits habits) {
        habitsDao.save(habits);
        return "redirect:/habits";
    }

    @GetMapping("habits/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Habits habits = habitsDao.findById(id).get();
        model.addAttribute("habitsadd", habits);
        return "habitsAdd";
    }

    @GetMapping("habits/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Habits habits = habitsDao.findById(id).get();
        model.addAttribute("habitsdetails", habits);
        return "habitsDetails";
    }
}
