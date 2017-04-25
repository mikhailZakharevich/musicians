package entity;

import javax.persistence.*;

/**
 * Created by Jenja on 05.04.2017.
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Integer id;

    private Float price;

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="event")
    private Event event;

    public Ticket(){}

    public Ticket(Event event, Float price)
    {
        this.event=event;
        this.price=price;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price){
        this.price=price;
    }

    public Event getEvent() {return event;}

    public void setEvent(Event event) {this.event=event;}

    @Override
    public String toString() {
        return "Ticket{" +
                "event='" + event + '\'' +
                ", price=" + price +
                '}';
    }
}
