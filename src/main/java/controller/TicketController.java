package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TicketService;

/**
 * Created by Jenja on 22.04.2017.
 */
@Controller
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @GetMapping
    public String getTicket(Model model) {
        model.addAttribute("tickets",ticketService.findAll());
        return "tickets";
    }

    @GetMapping("/{id}")
    public String getEvent(Model model, @PathVariable Integer id){
        model.addAttribute("ticket",ticketService.findById(id));
        return "ticket";
    }

}
