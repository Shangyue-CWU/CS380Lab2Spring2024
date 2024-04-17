/**
 * The {@code Bobcat} class represents a bobcat which is a predator native to North America.
 * It extends the {@code Animal} class and provides specific implementations for the
 * abstract methods to sound, play, and eat.
 */
public class Bobcat extends Animal {

    /**
     * Constructs a new Bobcat given its name.
     *
     * @param name The name of this Bobcat
     */
    public Bobcat(String name) {
        super(name);
    }

    /**
     * Produces the sound that a Bobcat makes.
     */
    @Override
    public void sound() {
        System.out.println(name + " the Bobcat growls.");
    }

    /**
     * Simulates the play behavior of a Bobcat.
     */
    @Override
    public void play() {
        System.out.println(name + " the Bobcat pounces playfully.");
    }

    /**
     * Simulates the eating behavior of a Bobcat.
     */
    @Override
    public void eat() {
        System.out.println(name + " the Bobcat eats a rabbit.");
    }
}
