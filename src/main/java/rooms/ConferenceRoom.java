package rooms;

public class ConferenceRoom extends Room {

    private String name;
    private String topic;


    public ConferenceRoom(int capacity, String name, String topic){
        super(capacity);
        this.name = name;
        this.topic = topic;

    }

    public String getConferenceRoomName(){
        return this.name;
    }

    public String getConferenceRoomTopic(){
        return this.topic;
    }

}
