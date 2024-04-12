
/**
 * A class representing an Alligator.
 */
public class Alligator extends Animal {
    
    /**
     * A constructor which makes an Alligator object.
     * 
     * @param name The name of the alligator.
     */
    public Alligator(String name) {
        super(name);
    }
    
    
    /**
     * Prints that the Alligator hissed.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " hissed.");
    }
    
    
    /**
     * Prints that the Alligator swam.
     */
    @Override
    public void play() {
        System.out.println(this.name + " swam.");
    }
}
