import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(3, 101, RoomType.TRIPLE);
        conferenceRoom = new ConferenceRoom(100, "North", "Programming");
        guest = new Guest("Harry");
    }

    @Test
    public void checkGuestAddedToConferenceRoom(){
        hotel.addGuestToConferenceRoom(guest);
        assertEquals(1, hotel.countConferenceRoomList());
    }

    @Test
    public void checkGuestRemovedFromConferenceRoom() {
        hotel.addGuestToConferenceRoom(guest);
        hotel.removeGuestFromConferenceRoom(guest);
        assertEquals(0, hotel.countConferenceRoomList());
    }

    @Test
    public void checkGuestAddedToBedroom() {
        hotel.addGuestToBedroom(guest);
        assertEquals(1, hotel.countBedroomList());
    }
    @Test
    public void checkGuestRemovedFromBedroom() {
        hotel.addGuestToBedroom(guest);
        hotel.removeGuestFromBedroom(guest);
        assertEquals(0, hotel.countBedroomList());
    }
}
