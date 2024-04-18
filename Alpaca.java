package CS380Lab2Spring2024;

public class Alpaca extends Animal {
    /**
     * Constructor for new Alpacas
     *
     * @param name Name of the Alpaca
     */
    public Alpaca(String name) {
        super(name);
    }

    /**
     * Methods that prints out a sound that Alpacas make
     *
     */
    @Override
    public void sound() {
        System.out.println(this.name + " hums to itself.");
    }
    /**
     * Method that lists an activity that Alpacas do for fun
     *
     */
    @Override
    public void play() {
        System.out.println(this.name + " nips at your legs!");
    }
    /**
     * Method that prints out what an Alpaca eats
     *
     */
    @Override
    public void eat() {
        System.out.println(this.name + " eats some grass.");
    }
}
