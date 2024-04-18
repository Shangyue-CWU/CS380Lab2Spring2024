public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name + " squeaks!");
    }

    @Override
    public void play() {
        System.out.println(name + " jumps!");
    }

    public void eat() {
        System.out.println(name + " eats grass!");
    }
}
