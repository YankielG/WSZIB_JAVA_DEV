package pl.edu.wszib.jwd.java_dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.jwd.java_dev.dao.IndexDao;
import pl.edu.wszib.jwd.java_dev.dao.HomeDao;
import pl.edu.wszib.jwd.java_dev.model.Index;

@Controller
@PropertySource("classpath:messages.properties")
public class IndexController {

    @Autowired
    private IndexDao indexDao;

    @Autowired
    private HomeDao homeDao;

    @GetMapping("index")
    public String index(Model model) {
//        model.addAttribute("lists", homeDao.findAll());
        model.addAttribute("lists1", indexDao.findAll());
        return "index";
    }

    @GetMapping("index/delete/{id}")
    public String delete(@PathVariable Long id) {
        indexDao.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("index/clear")
    public String clear() {
        indexDao.deleteAll();
        return "redirect:/index";
    }

    @GetMapping("index/add")
    public String add(Model model) {
        model.addAttribute("indexadd", new Index());
        return "indexadd";
    }

    @PostMapping("index/save")
    public String save(Index index) {
        indexDao.save(index);
        return "redirect:/index";
    }

    @GetMapping("index/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Index index = indexDao.findById(id).get();
        model.addAttribute("indexadd", index);
        return "indexadd";
    }

    @GetMapping("index/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Index index = indexDao.findById(id).get();
        model.addAttribute("indexdetails", index);
        return "indexdetails";
    }
}
