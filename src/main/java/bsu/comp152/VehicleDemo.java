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
    }
}
