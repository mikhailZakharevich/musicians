package service;

import dao.ArtistRepository;
import entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by eugen on 3/10/17.
 */
@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public Artist findById(Integer id) {
        return artistRepository.findOne(id);
    }

    public List<Artist> findAll() {
        return (List<Artist>) artistRepository.findAll();
    }

    public void save(Artist artist) { artistRepository.save(artist); }

    public void delete(Integer id) { artistRepository.delete(id); }

    public Artist getArtistByName(String name) { return artistRepository.findArtistByNameLike(name); }
    public Artist getArtistBySurname(String surname) { return artistRepository.findArtistBySurnameLike(surname); }

}
