package controller;

import entity.Composition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CompositionService;

/**
 * Created by Odyniuk on 13/04/2017.
 */
@Controller
@RequestMapping("/composition")
public class CompositionController {
    @Autowired
    CompositionService compositionService;

    @GetMapping
    public String getComposition(Model model) {
        model.addAttribute("compositions", compositionService.findAll());
        return "compositions";
    }

    @GetMapping("/{id}")
    public String getComposition(Model model, @PathVariable Integer id){
        model.addAttribute("composition",compositionService.findById(id));
        return "composition";
    }

    @GetMapping("/new")
    public String newComposition() {
        return "newComposition";
    }

    @PostMapping
    public String createComposition(Composition composition) {
        compositionService.save(composition);
        return "redirect:/composition";
    }

    @GetMapping("/delete/{id}")
    public String deleteComposition(@PathVariable Integer id){
        compositionService.delete(id);
        return "redirect:/composition";
    }

}
