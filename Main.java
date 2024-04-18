/**
 * This class is the main point of the program
 */
public class Main {

    /**
     * The main method of the program
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Create rabbit object named "Jimothy"
        Rabbit rabbit = new Rabbit("Jimothy");

        // Make the rabbit produce sound
        rabbit.sound();

        // Make the rabbit play
        rabbit.play();

        // Make the rabbit eat
        rabbit.eat();
    }
}
