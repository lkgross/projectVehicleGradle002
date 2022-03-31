package bsu.comp152;

/**
 * Vehicle - A class that represents a vehicle
 * It is a superclass of all the other classes that
 * represent vehicles, such as Automobile.
 *
 * Automobile is a subclass of Vehicle.
 *
 * Subclasses of Vehicle are Automobile, Motorcycle, Truck,
 * and their subclasses.
 *
 * We speak of an "is-a relationship": A Motorcycle is-a Vehicle, etc.
 *
 * We also say Vehicle is a base or parent class of the
 * Automobile class.
 *
 * We also say Automobile is a derived or child class of Vehicle.
 *
 * The fields and methods that all vehicles have in common are
 * defined in the Vehicle class.
 *
 * Starter code from Computer Science 11, Boston University
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
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
