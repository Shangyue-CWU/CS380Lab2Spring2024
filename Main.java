public class Main {
	public static void main (String[] args) {
		Goldfish goldfish1 = new Goldfish("Wei");
		
		System.out.println(goldfish1.getClass().getName()+" "+goldfish1.name);
		goldfish1.sound();
		goldfish1.play();
		goldfish1.eat();
	}
}
