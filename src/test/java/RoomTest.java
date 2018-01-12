import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        room = new Room();
        guest = new Guest("Joe");
    }

    @Test
    public void emptyArray(){
        assertEquals(0, room.count());
    }

    @Test
    public void canAdd(){
        room.addGuest(guest);
        assertEquals(1, room.count());
    }




}
