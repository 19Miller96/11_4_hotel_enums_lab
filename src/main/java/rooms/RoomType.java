package rooms;

public enum RoomType {
    SINGLE(1, 20),
    DOUBLE(2, 35),
    TRIPLE(3, 45),
    FAMILY(4, 60);

    private final int capacity;
    private final int nightlyRate;

    RoomType(int capacity, int nightlyRate){
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

}
