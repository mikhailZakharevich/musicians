/**package service;

import dao.EventDao;
import entity.Band;
import entity.Event;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventService {

    @Autowired
    EventDao eventDao;

    public Event findById(int id) {
        System.out.println("EventService: findByid() method");
        return eventDao.findById(id);
    }

    public List<Event> findAll() { return eventDao.findAll(); }

    public void save (Event event) { eventDao.save(event); }

    public void delete(int id) { eventDao.delete(id); }
}*/
package service;

import dao.EventRepository;
import entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kowalskiy on 15.03.17.
 */
@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public Event findById(int id) { return eventRepository.findOne(id);}

    public List<Event> findAll() { return (List<Event>) eventRepository.findAll(); }

    public void save (Event event) { eventRepository.save(event); }

    public void delete(int id) { eventRepository.delete(id); }
}
