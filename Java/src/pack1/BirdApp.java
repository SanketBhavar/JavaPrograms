package pack1;

abstract class Bird{
	abstract void fly();
	abstract void eat();
}

class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow fly very fast");
	}
	void eat() {
		System.out.println("Sparrow eats Insects");
	}
}

class Crow extends Bird{
	void fly() {
		System.out.println("Crow fly at medium height");
	}
	void eat() {
		System.out.println("Crow eats flesh");
	}
}

abstract class Eagle  extends Bird{
	void fly() {
		System.out.println("All eagle fly very high");
	}
	abstract void eat();
}

class SerpentEagle extends Eagle{
	void eat() {
		System.out.println("Serpent eagle eats snake");
	}
}

class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golden Eagle hunts over the occean");
	}
}
 
class Sky{
	void allowBirds(Bird ref) {
		ref.fly();
		ref.eat();
	}
}

public class BirdApp {
	public static void main(String[] args) {
		Sparrow s=new Sparrow();
		Crow c=new Crow();
		SerpentEagle se=new SerpentEagle();
		GoldenEagle ge=new GoldenEagle();
		Sky s1=new Sky();
		
		s1.allowBirds(s);
		System.out.println();
		s1.allowBirds(c);
		System.out.println();
		s1.allowBirds(se);
		System.out.println();
		s1.allowBirds(ge);
	}
}
