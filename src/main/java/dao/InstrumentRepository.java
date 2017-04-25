package dao;

import entity.Instrument;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Odyniuk on 17/04/2017.
 */
public interface InstrumentRepository extends CrudRepository<Instrument, Integer> {

}
