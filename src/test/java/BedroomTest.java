import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(3, 101, RoomType.TRIPLE);
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(3, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void canAddToGuestsList(){
        bedroom.addToGuestsList(guest);
        assertEquals( 1, bedroom.countGuestsList());
    }
}
