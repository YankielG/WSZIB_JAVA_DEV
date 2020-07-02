package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.jwd.java_dev.dao.HomeDao;
import pl.edu.wszib.jwd.java_dev.model.Home;

@Controller
@PropertySource("classpath:messages.properties")
public class HomeController {

    @Autowired
    private HomeDao homeDao;

    @GetMapping("home/delete/{id}")
    public String delete(@PathVariable Long id) {
        homeDao.deleteById(id);
        return "redirect:/home";
    }

    @GetMapping("home/clear")
    public String clear() {
        homeDao.deleteAll();
        return "redirect:/home";
    }

    @GetMapping(value={"/", "/login"})
    public String add(Model model) {
        model.addAttribute("homeadd", new Home());
            model.addAttribute("lists", homeDao.findAll());
        return "home";
    }

    @PostMapping("home/save")
    public String save(Home home) {
        homeDao.save(home);
        return "redirect:/index";
    }
    @PostMapping("login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("home/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Home home = homeDao.findById(id).get();
        model.addAttribute("homeadd", home);
        return "homeadd";
    }

    @GetMapping("home/details{id}")
    public String details(@PathVariable Long id, Model model) {
        Home home = homeDao.findById(id).get();
        model.addAttribute("homedetails", home);
        return "homedetails";
    }
}



