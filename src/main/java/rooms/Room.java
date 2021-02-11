package rooms;

import guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countGuestsList(){
        return this.guests.size();
    }

    public void addToGuestsList(Guest guest) {
        this.guests.add(guest);
    }

}
