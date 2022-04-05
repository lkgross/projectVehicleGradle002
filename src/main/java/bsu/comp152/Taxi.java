package bsu.comp152;

public class Taxi extends Automobile {

    private String taxiID;
    private double fareTotal; // amount of money the driver has collected in fares
    private int numFares;

    public Taxi(String make, String model,
                int year, int numSeats, boolean isSUV,
                String id) {
        super(make, model, year, numSeats, isSUV);
        taxiID = id;
    }

    public void setTaxiID(String id) {
        taxiID = id;
    }

    public void addFare(double fare){
        if (fare <= 0){
            throw new IllegalArgumentException("Argument" +
                    "to addFare must be positive.");
        }
        fareTotal += fare;
        numFares = numFares + 1;
    }

    public void resetFareInfo(){
        numFares = 0;
        fareTotal = 0;
    }

    public String getID() {
        return taxiID;
    }

    public double getFareTotal() {
        return fareTotal;
    }

    public int getNumFares() {
        return numFares;
    }

    @Override
    public String toString(){
        return String.format("Taxi (id = %s)", taxiID);
    }

    /**
     * A method to override the getNumSeats
     * method from the superclass
     * @return
     */
    @Override
    public int getNumSeats() {
        return super.getNumSeats() - 1;
    }





}

