package pack1;

abstract class Bird{
	abstract void fly();
	abstract void eat();
}

class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow fly Very Fast");
	}
	void eat() {
		System.out.println("Sparrow eats Insects");
	}
}

class Crow extends Bird{
	void fly() {
		System.out.println("Crow fly at Medium Height");
	}
	void eat() {
		System.out.println("Crow eats Flesh");
	}
}

abstract class Eagle  extends Bird{
	void fly() {
		System.out.println("All eagle fly Very High");
	}
	abstract void eat();
}

class SerpentEagle extends Eagle{
	void eat() {
		System.out.println("Serpent eagle eats Snake");
	}
}

class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golden Eagle hunts over the Occean");
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
