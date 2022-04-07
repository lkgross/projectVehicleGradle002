package bsu.comp152;

/**
 * FleetDemo.java
 * <p>
 * A class that illustrates concepts related to polymorphism.
 * <p>
 * Starter code from Computer Science 111, Boston University
 * <p>
 * Modified by Laura K. Gross, COMP 152, Bridgewater State University
 * <p>
 * Completed by: [student name], [student email]
 * date: [date of completion]
 */
public class FleetDemo {

    public static final int CURRENT_YEAR = 2022;

    public static void main(String[] args) {
        /* Polymorphism means "many forms".
         * An object that can pass more than one is-a test can be considered polymorphic.
         * Example: A TractorTrailer object is-a Truck; A TractorTrailer is-a Vehicle.
         * And, of course, a TractorTrailer is-a TractorTrailer.
         * That is, a child class object can take any form of a class in its
         * parent hierarchy and of course itself as well [medium.com].
         */

        /* Polymorphism is useful when we have a collection of objects of
         * different but related types.
         */

        // Consider an array of objects of different but related types.
        Vehicle[] fleet = new Vehicle[4];
        /* Remember all elements in an array in Java must have the same declared type.
         * Here all elements of the array are of declared type Vehicle.
         * Each element has a different "declared type" vs. "actual type."
         * Declared type is specified when declaring a variable.
         * Actual type is specified when creating an object.
         */
        fleet[0] = new Automobile("Honda", "Civic", 2016);
        fleet[1] = new Motorcycle("Harley", "Roadster", 2017);
        fleet[2] = new TractorTrailer("Mack", "Pinnacle DayCab", 2018, 10);
        fleet[3] = new Taxi("Toyota", "Highlander Hybrid", 2016,
                8, true, "A12345");
        /*
         * When we call a method on an object,
         * - the COMPILER will check whether the class for the DECLARED type of the object
         *   defines the method
         * - if the class for the DECLARED type of the object DOES define the method,
         *   the JVM will call the method as is most appropriate for the ACTUAL type
         *   of the object.
         */

        for (int i = 0; i < fleet.length; i++) {
            // Implicitly call the toString method on the ith element of the fleet.
            System.out.println(fleet[i].toString());
        }
        /*
         * We can do this because the COMPILER checks for the DECLARED type
         * of each element (Vehicle) confirms that Vehicle has a toString method.
         *
         * At runtime, the Java INTERPRETER selects the version of toString
         * that is appropriate to the ACTUAL type of the object---
         * either from the class of the declared type Vehicle
         * or from the class of the actual type in which toString is overridden.
         * This is known selection process is called dynamic binding.
         * It can be done by the JVM, not by the compiler.
         */

        /*
         * System.out.println(fleet[0]); # invokes the toString method in Automobile, which overrides
         * the toString method in Vehicle.
         * System.out.println(fleet[1]); # invokes the toString method in Vehicle,
         * which is inherited by Motorcycle.  (Motorcycle does not define its own toString method.)
         * System.out.println(fleet[2]); # invokes the toString method in TractorTrailer, which overrides
         * the toString method in Truck, which overrides the toString method in Vehicle.
         * System.out.println(fleet[3]); # invokes the toString method in Taxi, which overrides
         * the toString method in Automobile, which overrides the toString method in Vehicle.
         */

        System.out.println();
    }
}
