package bsu.comp152;

public class Motorcycle extends Vehicle {

    private boolean hasSideCar;
    private boolean isChopper;

    public Motorcycle(String make, String model, int year){
        super(make, model, year, 2);
        hasSideCar = false;
        isChopper = true;
    }
}
