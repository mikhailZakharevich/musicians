package service;

import dao.TicketRepository;
import entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jenja on 05.04.2017.
 */
@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public Ticket findById(Integer id) {
        return ticketRepository.findOne(id);
    }


    public List<Ticket> findAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void delete(Integer id) {
        ticketRepository.delete(id);
    }
}
