/**
 * Represents a Jaguar, a specific type of Animal. This class extends the abstract Animal class
 * and provides Jaguar-specific implementations for various behaviors such as sound and play.
 * <p>
 * The Jaguar class demonstrates polymorphism by overriding the abstract methods from the Animal
 * class. It also inherits the non-abstract method 'eat' which provides general behavior for eating.
 * <p>
 * Usage example:
 * <pre>
 *     Jaguar jaguar = new Jaguar("Jaggy");
 *     jaguar.sound();
 *     jaguar.play();
 *     jaguar.eat();
 * </pre>
 * @author Your Name
 */
public class Jaguar extends Animal {

    /**
     * Constructs a new Jaguar instance with the specified name.
     * The name is passed to the superclass constructor to initialize the name field
     * inherited from the Animal class.
     *
     * @param name The name of the jaguar.
     */
    public Jaguar(String name) {
        super(name); // Pass the name to the superclass constructor
    }

    /**
     * Produces a sound typical of a jaguar. This method overrides the abstract sound method
     * in the Animal class.
     * <p>
     * This implementation outputs a string describing the sound made by the jaguar,
     * typically a loud roar.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " roars loudly.");
    }

    /**
     * Describes a specific playful activity typical of a jaguar. This method overrides
     * the abstract play method in the Animal class.
     * <p>
     * The implementation for this method outputs a description of how the jaguar
     * engages in stalking playfully, which is characteristic of their behavior in the wild.
     */
    @Override
    public void play() {
        System.out.println(this.name + " stalks through the jungle playfully.");
    }
}