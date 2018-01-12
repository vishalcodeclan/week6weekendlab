import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Bedroom bedroom_single1;
    Bedroom bedroom_single2;
    Bedroom bedroom_double;
    Bedroom bedroom_club;
    Bedroom bedroom_family;
    ConferenceRoom conferenceRoom_small;
    ConferenceRoom conferenceRoom_large;
    Guest guest;
    Hotel hotel;

    @Before
    public void before(){
        bedroom_single1 = new Bedroom(201, Type.SINGLE, 1);
        bedroom_single2 = new Bedroom(202, Type.SINGLE, 2);
        bedroom_double = new Bedroom(201, Type.DOUBLE, 3);
        bedroom_club = new Bedroom(201, Type.CLUB, 4);
        bedroom_family = new Bedroom(201, Type.FAMILY, 5);
        conferenceRoom_small = new ConferenceRoom(Name.SMALL);
        conferenceRoom_large = new ConferenceRoom(Name.LARGE);
        guest = new Guest("Joe");
        hotel = new Hotel();
        hotel.addBedroom(bedroom_single1);
        hotel.addBedroom(bedroom_single2);
        hotel.addBedroom(bedroom_double);
        hotel.addBedroom(bedroom_club);
        hotel.addBedroom(bedroom_family);
        hotel.addConferenceRoom(conferenceRoom_small);
        hotel.addConferenceRoom(conferenceRoom_large);
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(bedroom_single1, guest);
        hotel.checkIn(bedroom_single1, guest);
        assertEquals(1, bedroom_single1.count());
    }

    @Test
    public void canCheckWhoIsCheckedIn(){
        hotel.checkIn(bedroom_family, guest);
        hotel.checkIn(bedroom_family, guest);
        hotel.checkIn(bedroom_family, guest);
        hotel.checkIn(bedroom_family, guest);
        hotel.checkIn(bedroom_family, guest);
        assertEquals("Vishal", bedroom_family.names().get(0));
    }

    @Test
    public void canCheckNumberOfVacantRooms(){
        hotel.checkIn(bedroom_single1, guest);
        hotel.checkIn(bedroom_family, guest);
        hotel.checkIn(bedroom_club, guest);
        assertEquals(2, hotel.numberOfVacantRooms());
    }

    @Test
    public void canCheckNights(){
        hotel.checkIn(bedroom_single1, guest);
        hotel.checkIn(bedroom_family, guest);
        hotel.checkIn(bedroom_club, guest);
        assertEquals(1, hotel.checkNights(201));
    }






}
