package bsu.comp152;

public class Truck extends Vehicle{

    private int capacity;

    public Truck (String make, String model, int year,
                  int numWheels){
        super(make, model, year, numWheels);
        capacity = 0;
    }

}
