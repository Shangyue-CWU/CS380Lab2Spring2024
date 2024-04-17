/**
 * The Main class for testing the Bobcat implementation.
 */
public class Main {

    /**
     * The main method for the Main class.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the Bobcat class
        Bobcat bobcat = new Bobcat("Bobby");

        // Call the methods of the Bobcat class
        bobcat.sound();
        bobcat.play();
        bobcat.eat();
    }
}
