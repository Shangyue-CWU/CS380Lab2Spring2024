/**
 * Concrete subclass representing a Falcon, extending the Animal class.
 */
public class Falcon extends Animal {

    /**
     * Constructor for creating a Falcon with a specified name.
     * @param name Name of the falcon.
     */
    public Falcon(String name) {
        super(name);
    }

    /**
     * Overrides the sound method to represent a shrill.
     */
    @Override
    public void sound() {
        System.out.println(name + " shrills!");
    }

    /**
     * Overrides the play method to represent flying around.
     */
    @Override
    public void play() {
        System.out.println(name + " flies around.");
    }

    /**
     * Overrides the eat method to represent eating a small bird.
     */
    @Override
    public void eat() {
        System.out.println(name + " eats a small bird.");
    }
}

