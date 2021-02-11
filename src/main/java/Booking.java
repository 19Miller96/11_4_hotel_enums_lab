import rooms.Bedroom;

public class Booking {
    private Bedroom bedroom;
    private int numberOfNightsBooked;

    public Booking(Bedroom bedroom, int numberOfNightsBooked){
        this.bedroom = bedroom;
        this.numberOfNightsBooked = numberOfNightsBooked;
    }
}
