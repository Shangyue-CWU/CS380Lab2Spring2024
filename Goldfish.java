/*
 *@author Jesus Sanchez.
 */
public class Goldfish extends Animal {


   /**
    * A field which stores the animals name.
    */
   protected String name;


   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Goldfish(String name){
      super(name);
	this.name = name;
   }


   /**
    *Method for fish sound
    */
   public void sound() {
	System.out.println("blub blub");
   }

   /**
    * Represents what fish do for fun (besides soccer).
    */
   public void play() {
	System.out.println("swimmy swimmy");
   }


   /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      System.out.println(name + " eats some food.");
   }
}

