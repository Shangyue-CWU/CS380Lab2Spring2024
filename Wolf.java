/**
 * This class represents a wolf and has implementations
 * for the wolf's behavior such as how it sounds and plays. 
 */
public class Wolf extends Animal {
    
    /**
     * Constructs a new wolf with specified name.
     * @param name The name of the wolf.
     */
    public Wolf(String name){
        super(name);
    }

    /**
     * Prints out the sound a wolf makes i.e. howl
     */
    @Override
    public void sound(){
        System.out.println(this.name + " howls.");
    }

    /**
     * Prints out how a wolf plays i.e. play-fighting with other wolves
     */
    @Override
    public void play(){
        System.out.println(this.name + " plays by play-fighting with other wolves.");
    }

}
