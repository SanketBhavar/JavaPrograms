package pack1;

class Animal{
	void eat() {
		System.out.println("Animal is Eating");
	}
	void sleep() {
		System.out.println("Animal is Sleeping");
	}
	void breath() {
		System.out.println("Animal is Breathing");
	}
}

class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger is Hunt and Eat");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("deer is graze and Eat");
	}
}

class Monkey extends Animal{
	void eat() {
		System.out.println("Monkey is steals and Eat");
	}
}

public class AnimalApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		
		t.eat();
		t.sleep();
		t.breath();
		
		System.out.println();
		d.eat();
		d.sleep();
		d.breath();
		
		System.out.println();
		m.eat();
		m.sleep();
		m.breath();
	}
}
