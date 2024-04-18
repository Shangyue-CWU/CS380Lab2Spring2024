package CS380Lab2Spring2024;

public class Test {
    /**
     * This is the main driver for testing
     *
     * @param args
     */
    public static void main(String[] args) {
        // Initialize the animal instance
        Alpaca animal = new Alpaca("Bobby");
        // Run the actions
        animal.sound();
        animal.play();
        animal.eat();
    }
}
