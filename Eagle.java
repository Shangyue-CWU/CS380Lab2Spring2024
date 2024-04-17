/**
 * Eagle Object
 * @author Matthew Hansen.
 */
public class Eagle extends Animal {

   /**
    * Constructor
    * @param name name of animal
    */
   public Eagle(String name) {
      
      // Calls constructor
      super(name); 
   }

   /**
    * Prints out the sound an eagle makes.
    */
   public void sound() {
      System.out.println(this.name + " screeches, at the presidential election.");   
   }

   /**
    * Prints out what an eagle does to play.
    */
   public void play() {
      System.out.println(this.name + " swoops down into a lake and picks up a fish, as an American flag sways in the background.");
   }
   
}