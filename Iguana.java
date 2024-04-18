//Name: Alex Solomon
//Date: 4/17/2024
//Assignment: CS380 Lab 2 Iguana.java

public class Iguana extends Animal 
{
    public Iguana(String name) 
    {
        super(name); // Call the superclass constructor to set the name
    }

    @Override
    public void sound() 
    {
        System.out.println(this.name + " makes a hissing sound.");
    }

    @Override
    public void play() 
    {
        System.out.println(this.name + " enjoys sunbathing on a warm rock.");
    }
}
