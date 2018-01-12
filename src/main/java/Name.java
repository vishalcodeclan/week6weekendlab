public enum Name {

    SMALL(50, 1000),
    MEDIUM(100, 1800),
    LARGE(200, 3000);

    private final int capacity;
    private final int value;

    Name(int capacity, int value){
        this.capacity = capacity;
        this.value = value;
    }

    public int capacity(){
        return this.capacity;
    }

    public int value(){
        return this.value;
    }

}


