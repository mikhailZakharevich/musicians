package controller;

import entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.ArtistService;

/**
 * Created by admin on 13.04.2017.
 */
@Controller
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping
    public String getArtists(Model model) {
        model.addAttribute("artists", artistService.findAll());
        return "artists";
    }

    @GetMapping("/{id}")
    public String getArtist(Model model, @PathVariable Integer id) {
        model.addAttribute("artist",artistService.findById(id));
        return "artist";
    }

    @GetMapping("/new")
    public String newArtist() {
        return "newArtist";
    }

    @PostMapping
    public String createArtist(Artist artist) {
        artistService.save(artist);
        return "redirect:/artist";
    }

    @GetMapping("/delete/{id}")
    public String deleteArtist(@PathVariable Integer id){
        artistService.delete(id);
        return "redirect:/artist";
    }

}
