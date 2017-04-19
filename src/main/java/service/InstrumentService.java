package service;

import dao.InstrumentRepository;
import entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Odyniuk on 17/04/2017.
 */
@Service
public class InstrumentService {

    @Autowired
    InstrumentRepository instrumentRepository;

    public Instrument findById(Integer id) {
        return instrumentRepository.findOne(id);
    }


    public List<Instrument> findAll() {
        return (List<Instrument>) instrumentRepository.findAll();
    }

    public void save(Instrument user) {
        instrumentRepository.save(user);
    }

    public void delete(Integer id) {
        instrumentRepository.delete(id);
    }
}