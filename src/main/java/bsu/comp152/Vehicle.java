package bsu.comp152;

/**
 * Vehicle - A class that represents a vehicle
 */
public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String plateNumber;
    private int numWheels;

    public Vehicle(String make, String model, int year,
                   int numWheels){
        this.make = make;
        this.model = model;
        if (year < 1900){
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.numWheels = numWheels;
        mileage = 0;
        plateNumber = "unknown";
    }

    // Mutators

    public void setMileage(int newMileage) {
        if (newMileage < mileage){
            throw new IllegalArgumentException();
        }
        mileage = newMileage;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    // Accessors


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public String toString() {
        return String.format("Vehicle{make = '%s', model = '%s'}",
                make, model);
    }
}
