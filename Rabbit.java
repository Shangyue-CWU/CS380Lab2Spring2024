/**
 * This class constructs a rabbit, of type Animal
 */
public class Rabbit extends Animal {

    /**
     * Constructs a new rabbit object with the given name.
     * 
     * @param name The name of the rabbit.
     */
    public Rabbit(String name) {
        super(name);
        this.name = name;
    }

    /**
     * Produces a sound characteristic of a rabbit.
     */
    @Override
    public void sound() {
        System.out.println(name + " squeaks!");
    }

    /**
     * Makes the rabbit play.
     */
    @Override
    public void play() {
        System.out.println(name + " jumps!");
    }

    /**
     * Makes the rabbit eat grass.
     */
    public void eat() {
        System.out.println(name + " eats grass!");
    }
}
