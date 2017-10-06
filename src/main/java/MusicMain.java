import config.AppConfig;
import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MusicMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AreaService areaService = context.getBean(AreaService.class);
        UserService userService = context.getBean(UserService.class);
        CompositionService compositionService = context.getBean(CompositionService.class);
        ArtistService artistService = context.getBean(ArtistService.class);
        TicketService ticketService = context.getBean(TicketService.class);
        EventService eventService = context.getBean(EventService.class);

        ticketService.save(generateTicket());
        System.out.println(eventService.findAll());
        System.out.println(ticketService.findAll());
        //  artistService.save(generateArtist());
        //System.out.println(artistService.findAll());
        //userService.save(generateUser());
        //System.out.println(userService.findAll());
        //System.out.println(compositionService.findAll());
        /*areaService.save(generateArea());
        System.out.println(areaService.findAll());*/
        //System.out.println(areaService.getAreaByName("Jazz*");
    }

    private static Composition generateComposition(){
        Composition composition = new Composition();
        composition.setName("Mother Song");
        composition.setArtist("Sinoptik");
        composition.setDuration(4.35f);
        composition.setRating(5.0f);
        return composition;
    }

    private static Artist generateArtist() {
        Artist artist = new Artist();
        artist.setName("Slava");
        artist.setSurname("Vakarchuk");
        return artist;
    }

    private static User generateUser() {
        List<Composition> playlist = new ArrayList<Composition>();
        playlist.add(generateComposition());
        User user = new User();
        user.setName("Smb");
        user.setAge(22);
        user.setCompositions(playlist);
        return user;
    }
    private static Area generateArea() {
        Area area = new Area();
        area.setName("Jazzter");
        area.setAddress("Poetry square");
        area.setNumOfPlaces(100);
        return area;
    }
    private static Event generateEvent()
    {
        Date date=null;
        String s="05.09.2013";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try{
            date=format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Area area=generateArea();

        Event event=new Event();
        event.setArea(area);
        event.setDate(date);
        event.setName("WInter");
        return event;
    }

    private static Ticket generateTicket()
    {
        Event event=generateEvent();
        Ticket ticket = new Ticket();
        ticket.setEvent(event);
        ticket.setPrice((float)200);
        return ticket;
    }

}

