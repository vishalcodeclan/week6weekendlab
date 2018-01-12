import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferencerooms = new ArrayList<>();
    }


    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferencerooms.add(conferenceRoom);
    }

    public void checkIn(Bedroom bedroom_single, Guest guest) {
        if (bedroom_single.type.getCapacity() > bedroom_single.count()) {
            bedroom_single.addGuest(guest);
        }
    }

    public int numberOfVacantRooms() {
        ArrayList<Bedroom> vacant = new ArrayList<>();
        for(Bedroom bedroom: this.bedrooms){
            if(bedroom.guest.size() == 0){
                vacant.add(bedroom);
            }
        }
        return vacant.size();
    }

    public int checkNights(int i) {
        for(Bedroom bedroom: this.bedrooms){
            if(bedroom.roomNumber == i){
                return bedroom.getNights();
            }
        }
        return 1;
    }


}
