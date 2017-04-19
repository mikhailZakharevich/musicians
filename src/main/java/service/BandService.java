package service;

import dao.BandRepository;
import entity.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ������� on 12.03.2017.
 */
@Service
public class BandService {

    @Autowired
    BandRepository bandRepository;

    public Band findById(Integer id) {
        return bandRepository.findOne(id);
    }


    public List<Band> findAll() {
        return (List<Band>) bandRepository.findAll();
    }

    public void save(Band band) {
        bandRepository.save(band);
    }

    public void delete(Integer id) {
        bandRepository.delete(id);
    }

}
