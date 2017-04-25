package controller;

import entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.InstrumentService;

/**
 * Created by Odyniuk on 17/04/2017.
 */
@Controller
@RequestMapping("/instrument")
public class InstrumentController {
    @Autowired
    InstrumentService instrumentService;

    @GetMapping
    public String getInstruments(Model model) {
        model.addAttribute("instruments", instrumentService.findAll());
        return "instruments";
    }

    @GetMapping("/{id}")
    public String getInstrument(Model model, @PathVariable Integer id){
        model.addAttribute("instrument",instrumentService.findById(id));
        return "instrument";
    }

    @GetMapping("/new")
    public String newInstrument() {
        return "newInstrument";
    }

    @PostMapping
    public String createInstrument(Instrument instrument) {
        instrumentService.save(instrument);
        return "redirect:/instrument";
    }

    @GetMapping("/delete/{id}")
    public String deleteInstrument(@PathVariable Integer id){
        instrumentService.delete(id);
        return "redirect:/instrument";
    }
}
