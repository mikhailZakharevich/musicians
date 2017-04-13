package dao;

import entity.Artist;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 13.04.2017.
 */
public interface ArtistRepository extends CrudRepository<Artist, Integer>{

    Artist findArtistByNameLike(String name);

    Artist findArtistBySurnameLike(String surname);
}
