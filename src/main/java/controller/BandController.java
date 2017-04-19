package controller;

import entity.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BandService;

/**
 * Created by Odyniuk on 17/04/2017.
 */
@Controller
@RequestMapping("/band")
public class BandController {

    @Autowired
    BandService bandService;

    @GetMapping
    public String getBands(Model model) {
        model.addAttribute("bands", bandService.findAll());
        return "bands";
    }

    @GetMapping("/{id}")
    public String getBand(Model model, @PathVariable Integer id){
        model.addAttribute("band",bandService.findById(id));
        return "band";
    }

    @GetMapping("/new")
    public String newBand() {
        return "newBand";
    }

    @PostMapping
    public String createBand(Band band) {
        bandService.save(band);
        return "redirect:/band";
    }

    @GetMapping("/delete/{id}")
    public String deleteBand(@PathVariable Integer id){
        bandService.delete(id);
        return "redirect:/band";
    }
}
