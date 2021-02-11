import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(100, "North", "Programming");
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("North", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void conferenceRoomHasTopic(){
        assertEquals("Programming", conferenceRoom.getConferenceRoomTopic());
    }

    @Test
    public void canAddToGuestsList(){
        conferenceRoom.addToGuestsList(guest);
        assertEquals( 1, conferenceRoom.countGuestsList());
    }
}
