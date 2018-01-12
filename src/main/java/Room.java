import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    protected ArrayList<Guest> guest;

    public Room() {
        this.guest = new ArrayList<Guest>();
    }


    public int count() {
        return this.guest.size();
    }

    public void addGuest(Guest guest) {
        this.guest.add(guest);
    }

    public ArrayList<String> names(){
        ArrayList<String> collection = new ArrayList<>();
        for(Guest guest: this.guest){
            collection.add(guest.getName());
            }
        return collection;
    }




}
