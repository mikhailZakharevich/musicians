package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by eugen on 3/3/17.
 */
//@Entity
public class Artist {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "artist_id")
    private Integer id;

    private String name;

    private String surname;

    //@ManyToOne(fetch=FetchType.LAZY)
    //private Band band;

    //private List<Instrument> instrumentList;

    public Artist() {
    }

    public Artist(String name, String surname) {
        this.name = name;

        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /*public List<Instrument> getInstrumentList() {
        return instrumentList;
    }*/

    /*public void setInstrumentList(List<Instrument> instrumentList) {
        this.instrumentList = instrumentList;
    }*/

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                //", Instrument=" + instrumentList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
