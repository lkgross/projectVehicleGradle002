package bsu.comp152;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Panasonic", "B123",
                1982, 2);

        v1.setMileage(10);

        System.out.println(v1);
    }
}
