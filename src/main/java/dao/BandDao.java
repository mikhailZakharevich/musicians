package dao;

import entity.Band;

import java.util.List;

public interface BandDao {

    Band findById(Integer id);

    List<Band> findAll();

    void save(Band band);

    void delete(Integer id);
}
