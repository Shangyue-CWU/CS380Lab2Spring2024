import java.util.*;
public class Elk extends Animal{

   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Elk(String n){
      super(n);
   }


   /**
    * Abstract method that should represent a specific sound
    * an animal makes.
    */
   public void sound(){
      int soundDeterminant = (int)(Math.random() * 3) + 1;
      if(soundDeterminant == 1){ System.out.println("Ghwraaheeeeeee"); }
      else if(soundDeterminant == 2){ System.out.println("Brbrrreeeeeyew"); }
      else { System.out.println("Grreap eeeereeeeeheeum"); }
   }


   /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
   public void play(){
      int playDeterminant = (int)(Math.random() * 3) + 1;
      if(playDeterminant == 1){ System.out.println(super.name + " sloshed through a HUGE puddle."); }
      else if(playDeterminant == 2){ System.out.println(super.name + " overturned a small car."); }
      else { System.out.println(super.name + " trampled a bear."); }
   }


   /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      int foodDeterminant = (int)(Math.random() * 3) + 1;
      if(foodDeterminant == 1){ System.out.println(super.name + " ate a bad mushroom and got sick.ad"); }
      else if(foodDeterminant == 2){ System.out.println(super.name + " ate some grass."); }
      else { System.out.println(super.name + " ate a weird mushroom and could hear colors."); }
   }
   
}

