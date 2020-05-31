package pl.edu.wszib.jwd.java_dev.controller;

import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.jwd.java_dev.dao.Error404Dao;
import pl.edu.wszib.jwd.java_dev.model.Error404;

@ControllerAdvice
//@RestController
//@Controller
@PropertySource("classpath:messages.properties")
public class Error404Controller extends Throwable {

    @Autowired
    private Error404Dao error404Dao;

    @ExceptionHandler(NotFoundException.class)
    public String error() {
        return "error404";
    }

    @GetMapping("error404")
    public String error404(Model model) {
        model.addAttribute("lista", error404Dao.findAll());
        return "error404";
    }

    @GetMapping("error404/usun/{id}")
    public String usun(@PathVariable Long id) {
        error404Dao.deleteById(id);
        return "redirect:/error404";
    }

    @GetMapping("error404/czysc")
    public String czysc() {
        error404Dao.deleteAll();
        return "redirect:/error404";
    }

    @GetMapping("error404/wstaw")
    public String wstaw(Model model) {
        model.addAttribute("error404dodaj", new Error404());
        return "error404dodaj";
    }

    @PostMapping("error404/zapisz")
    public String zapisz(Error404 error404) {
        error404Dao.save(error404);
        return "redirect:/error404";
    }

    @GetMapping("error404/edytuj/{id}")
    public String edytuj(@PathVariable Long id, Model model) {
        Error404 error404 = error404Dao.findById(id).get();
        model.addAttribute("error404dodaj", error404);
        return "error404dodaj";
    }

    @GetMapping("error404/szczegoly/{id}")
    public String szczegoly(@PathVariable Long id, Model model) {
        Error404 error404 = error404Dao.findById(id).get();
        model.addAttribute("error404szczegoly", error404);
        return "error404szczegoly";
    }

//    private static Logger logger = LoggerFactory.getLogger(ErrorController.class);
//
//    @ExceptionHandler(Throwable.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public String exception(final Throwable throwable, final Model model) {
//        logger.error("Exception during execution of SpringSecurity application", throwable);
//        String errorMessage = (throwable != null ? throwable.getMessage() : "Unknown error");
//        model.addAttribute("errorMessage", errorMessage);
//        return "error404";
//    }

}
