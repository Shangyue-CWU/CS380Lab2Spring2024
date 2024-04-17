import java.util.*;
public class Elk extends Animal{

   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Elk(String name){
      super(name);
   }


   /**
    * Abstract method that should represent a specific sound
    * an animal makes.
    */
   public void sound(){
      int soundDeterminant = (int)(Math.random() * 3) + 1;
      if(soundDeterminant == 1){ System.out.print("\"Ghwraaheeeeeee,\" "); }
      else if(soundDeterminant == 2){ System.out.print("\"Brbrrreeeeeyew,\" "); }
      else { System.out.print("\"Grreap eeeereeeeeheeum,\" "); }
      
      soundDeterminant = (int)(Math.random() * 3) + 1;
      if(soundDeterminant == 1){ System.out.println(super.name + " said enthusiastically."); }
      else if(soundDeterminant == 2){ System.out.println(super.name + " said sadly."); }
      else { System.out.println(super.name + " said with suspicion."); }

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
      if(foodDeterminant == 1){ System.out.println(super.name + " ate a bad mushroom and got sick."); }
      else if(foodDeterminant == 2){ System.out.println(super.name + " ate some grass."); }
      else { System.out.println(super.name + " ate a weird mushroom and could hear colors."); }
   }
}