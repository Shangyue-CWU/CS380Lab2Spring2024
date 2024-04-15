

public class BlackBear extends Animal {
    /**
     * A constructor which makes a Black Bear object
     * 
     * @param name the name of the Black Bear
     */

     public BlackBear (String name) {
        super(name);
     }

     /**
      * Prints the sound of the BlackBear when it sounds gr gr
      */
	@Override
    public void sound() {
        System.out.println(this.name + " gr gr.");
    }
    /**
     * This method represents the activity of a Black Bear while playing
     */
	@Override
    public void play() {
        System.out.println(this.name + "playing with their siblings ");
    }

}
