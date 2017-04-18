package dao;

import entity.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jenja on 14.04.2017.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
}
