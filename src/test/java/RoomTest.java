import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        room = new Room(4);
        guest = new Guest("Harry");
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void canAddToGuestsList(){
        room.addToGuestsList(guest);
        assertEquals( 1, room.countGuestsList());
    }

}
