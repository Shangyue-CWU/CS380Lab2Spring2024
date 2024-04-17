public class Shark extends Animal{

    /**
     * A constructor that takes in a name Shark.
     *
     * @param name String name of the animal which is the Shark.
     */
    public Shark(String name) {
        super(name);
    }

    /**
     * A method for displaying the sound of a Shark.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " doesn't make sounds. Just SPLASH SPLASH.");
    }

    /**
     * A method for showing how the Shark plays.
     */
    @Override
    public void play() {
        System.out.println(this.name + " plays with other sharks, remora fish, pilot fish, and rarely humans too.");
    }
}
