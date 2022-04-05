package bsu.comp152;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Panasonic", "B123",
                1982, 2);

        v1.setMileage(10);

        System.out.println(v1);

        Automobile car1 = new Automobile("Toyota", "Prius", 2017);

        Automobile car2 = new Automobile("Suburu",
                "Ascent", 2020, 7, true);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("The plate number of Car 1 is " + car1.getPlateNumber());

        car1.setPlateNumber("LK144");

        System.out.println("The plate number of Car 1 is " + car1.getPlateNumber());


        // Call the Taxi constructor from the Taxi class.
        Taxi taxi1 = new Taxi("Toyota", "Highlander Hybrid",
                2016, 8, true, "A12345");

        System.out.println(taxi1);

        System.out.println("Taxi 1 fareTotal: " + taxi1.getFareTotal());
        System.out.println("Taxi 1 number of fares: " + taxi1.getNumFares());
        System.out.println();
        // First fare of the day is $23.
        taxi1.addFare(23);
        System.out.printf("Taxi 1 fareTotal: $%.2f\n", taxi1.getFareTotal());
        System.out.println("Taxi 1 number of fares: " + taxi1.getNumFares());
        System.out.println();
        // Second fare of the day is $1.
        taxi1.addFare(11);
        System.out.printf("Taxi 1 fareTotal: $%.2f\n", taxi1.getFareTotal());
        System.out.println("Taxi 1 number of fares: " + taxi1.getNumFares());
        System.out.println();
        taxi1.resetFareInfo();
        System.out.printf("Taxi 1 fareTotal: $%.2f\n", taxi1.getFareTotal());
        System.out.println("Taxi 1 number of fares: " + taxi1.getNumFares());
        System.out.println();
        System.out.printf("Taxi 1 has %d seats.", taxi1.getNumSeats());


    }
}
