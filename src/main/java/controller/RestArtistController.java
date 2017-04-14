package controller;

import entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.ArtistService;

import java.util.List;

/**
 * Created by admin on 13.04.2017.
 */
//@Controller
//@RequestMapping("/artist")
/*public class RestArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping
    public List<Artist> getArtists() { return artistService.findAll(); }

    @GetMapping(value = "/{id}")
    public Artist getArtist(@PathVariable Integer id) { return artistService.findById(id); }

    @PostMapping
    public String insertArtist(@RequestBody Artist artist) {
        artistService.save(artist);
        return "New artist was added";
    }
}*/
