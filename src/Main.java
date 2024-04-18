/**
 * This class serves as a testing framework for the Jaguar class.
 * It is designed to instantiate and utilize the Jaguar class to ensure that
 * all implemented methods perform as expected. It specifically tests the behavior
 * of the Jaguar's sound, play, and eating actions.
 *
 * Usage:
 * <pre>
 * java Main
 * </pre>
 * This will output the results of the Jaguar's sound, play, and eat methods
 * to the standard output, demonstrating the capabilities and behaviors
 * defined in the Jaguar class.
 */
public class Main {
    /**
     * The main method acts as the entry point for the program and is responsible
     * for creating instances and invoking methods of the Jaguar class to verify
     * their functionality.
     *
     * @param args the command line arguments, not used in this application
     */
    public static void main(String[] args) {
        // Create an instance of Jaguar with a specific name
        Jaguar jaguar = new Jaguar("Jaggy");

        // Invoke methods on the jaguar instance to test its behaviors
        jaguar.sound();   // Test the sound method outputs "Jaggy roars loudly."
        jaguar.play();    // Test the play method outputs "Jaggy stalks through the jungle playfully."
        jaguar.eat();     // Test the inherited eat method outputs "Jaggy eats some food."

        // Optionally, you could add more testing scenarios here to further test different behaviors or edge cases
    }
}