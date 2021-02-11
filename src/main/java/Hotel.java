import guest.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Guest> bedroomsList;
    private ArrayList<Guest> conferenceRoomsList;
    private int numberOfBedrooms;
    private int numberOfConferenceRooms;

    public Hotel(int numberOfBedrooms, int numberOfConferenceRooms){
        this.bedroomsList = new ArrayList<Guest>();
        this.conferenceRoomsList = new ArrayList<Guest>();
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfConferenceRooms = numberOfConferenceRooms;
    }

    public void addGuestToBedroom(Guest guest){
        this.bedroomsList.add(guest);
    }

    public void addGuestToConferenceRoom(Guest guest){
        this.conferenceRoomsList.add(guest);
    }

    public void removeGuestFromConferenceRoom(Guest guest){
        if (conferenceRoomsList.size() > 0) {
            this.conferenceRoomsList.remove(guest);
        }
    }

    public void removeGuestFromBedroom(Guest guest) {
        if (bedroomsList.size() > 0) {
        this.bedroomsList.remove(guest);
        }
    }

    public int countBedroomList(){
        return this.bedroomsList.size();
    }

    public int countConferenceRoomList(){
        return this.conferenceRoomsList.size();
    }

    public int getNumberOfBedrooms() {return this.numberOfBedrooms;}

    public int getNumberOfConferenceRooms() {return this.numberOfConferenceRooms;}

    public void bookRoom(Booking booking){

    }

}
