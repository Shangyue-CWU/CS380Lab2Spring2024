//Santos Gonzalez
//4/17/24


/**
 * Duck class represents a duck extending the Animal class.
 */
public class Duck extends Animal {

    /**
     * Constructor for Duck class.
     * 
     * @param name The name of the duck.
     */
    public Duck(String name) {
        super(name);
    }
    /**
     * Produces the sound of a duck.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " Says Quack Quack");
    }
    /**
     * Simulates a duck playing.
     */
    @Override
    public void play() {
        System.out.println(this.name + " is playing");
    }
   }

