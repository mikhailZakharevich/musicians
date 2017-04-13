package dao;

import entity.Artist;

import java.util.List;

/**
 * Created by eugen on 3/10/17.
 */
public interface ArtistDao {

    Artist findById(Integer id);

    List<Artist> findAll();

    void save(Artist artist);

    void delete(Integer id);

}
