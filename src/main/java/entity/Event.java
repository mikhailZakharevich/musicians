package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kowalskiy on 15.03.17.
 */
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="area")
    private Area area;

    private Date date;

    public Event(){}

    public Event(Area area,String name, Date date)
    {
        this.area=area;
        this.date=date;
        this.name=name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //private List<Band> participants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Area getArea() { return area; }

    public void setArea(Area area) { this.area = area; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

/*    public List<Band> getParticipants() {
        return participants;
    }
*/
    /*public void setParticipants(List<Band> participants) {
        this.participants = participants;
    }
*/
    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", address=" + area +
                ", date=" + date +
  //              ", participants=" + participants +
                '}';
    }
}
