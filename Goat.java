import java.util.*;

/**
 * This class represents a Goat, which is an Animal that eats grass and makes a bleating sound.
 */
public class Goat extends Animal {

    /**
     * Constructor for Goat class.
     *
     * @param name The name of the goat.
     */
    public Goat(String name) {
        super(name);
    }

    /**
     * The sound a goat makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " makes a bleating sound.");
    }

    /**
     * The activity of a goat playing.
     */
    @Override
    public void play() {
        System.out.println(this.name + " plays on the rocks.");
    }
}