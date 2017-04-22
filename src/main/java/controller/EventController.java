package controller;

import entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EventService;

/**
 * Created by Jenja on 22.04.2017.
 */
@Controller
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping
    public String getEvents(Model model) {
        model.addAttribute("events",eventService.findAll());
        return "events"; // /jsp/events.jsp
    }

    @GetMapping("/{id}")
    public String getEvent(Model model, @PathVariable Integer id){
        model.addAttribute("event",eventService.findById(id));
        return "event";
    }

    @GetMapping("/new")
    public String newEvent() {
        return "newEvent";
    }

    @PostMapping
    public String createEvent(Event event)
    {
        eventService.save(event);
        return "redirect:/event";
    }

    @GetMapping("/delete/{id}")
    public String deleteEvent(@PathVariable Integer id){
        eventService.delete(id);
        return "redirect:/event";
    }
}
