package dao;

import entity.Ticket;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jenja on 05.04.2017.
 */
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
