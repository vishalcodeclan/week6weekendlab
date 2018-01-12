public class Bedroom extends Room {

    protected Integer roomNumber;
    protected Type type;
    protected int nights;


    public Bedroom(Integer roomNumber, Type type, int nights){
        this.roomNumber = roomNumber;
        this.type = type;
        this.nights = nights;
    }

    public int getNights() {
        return this.nights;
    }



    public Type getType() {
        return type;
    }

}
