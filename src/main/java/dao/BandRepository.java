package dao;

import entity.Band;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Odyniuk on 17/04/2017.
 */
public interface BandRepository extends CrudRepository<Band, Integer>{
}
