package bsu.comp152;

/**
 * Automobile - A class that represents an
 * automobile
 *
 * It is a subclass of Vehicle.
 *
 * It inherits the (fields and) methods of
 * Vehicle!
 *
 * It also extends the capabilities of the
 * Vehicle class with more specialized
 * functionality.
 *
 * Note the required syntax "extends Vehicle".
 *
 * Starter code from Computer Science 111,
 * Boston University
 */
public class Automobile extends Vehicle{

    private int numSeats;
    private boolean isSUV;

    /**
     * A constructor with five parameters
     * @param make
     * @param model
     * @param year
     * @param numSeats
     * @param isSUV
     *
     * To initialize the inherited fields, the constructor
     * must call a constructor from the superclass.
     *
     * It calls the constructor in the superclass using the
     * keyword super, followed by the appropriate parameters
     * for the superclass constructor.
     *
     * Make the call super as the very first line
     * of the constructor (the same as when one constructor
     * calls another constructor using the reference
     * variable this from within the same class).
     *
     */
   public Automobile(String make, String model, int year,
                     int numSeats, boolean isSUV) {
        super(make, model, year, 4);
        this.numSeats = numSeats;
        this.isSUV = isSUV;
   }

   public Automobile(String make, String model, int year){
       super(make, model, year, 4);
       numSeats = 5;
       isSUV = false;
   }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean isSUV() {
        return isSUV;
    }

    /**
     * Method to override the toString inherited from Vehicle.
     *
     * To *override* a method, the new method in the subclass must have
     * the same signature (name, number and types of parameters, and
     * return type) as the inherited method.
     *
     * Use @Override to have Java tell you if you accidentally don't use
     * the same signature as the inherited method.
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s %s (numSeats %d)", getMake(), getModel(), numSeats);
    }
    /* Fields defined in Automobile can be accessed directly by methods
     * defined in Automobile.
     * Fields from Vehicle can't be accessed directly by methods
     * defined in Automobile. (Use the getters.)
     * Don't try to illegally access inherited private fields.
     * For example, the toString method can't include
     * String.format("%s %s (numSeats %d)\n", make, model, numSeats);
     *
     */
}
