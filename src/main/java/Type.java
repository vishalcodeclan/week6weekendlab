public enum Type {

    SINGLE(1, 100),
    DOUBLE(2, 200),
    EXECUTIVE(2, 300),
    CLUB(2, 400),
    FAMILY(4, 300),
    SUITE(4, 600);


    private final int capacity;
    private final int value;

    Type(int capacity, int value) {
        this.capacity = capacity;
        this.value = value;
    }

    public int getCapacity() {
        return this.capacity;

    }

    public int getValue(){
        return this.value;
    }

}


