package pack1;

class Heart{
	Heart(){
		System.out.println("Heart is created");
	}
	void getHeart() {
		System.out.println("Heart is pumping Blood");
	}
}

class Brain{
	Brain(){
		System.out.println("Brain is created");
	}
	void getBrain() {
		System.out.println("Brain is still working");
	}
}

class Car{
	Car(){
		System.out.println("Car created");
	}
	void getCar() {
		System.out.println("Car can be used for driving");
	}
}

class Person1{
	Heart h=new Heart();
	Brain b=new Brain();
	Person1(){
		System.out.println("Person created with Heart and Brain");
	}
	void hasA(Car c) {
		System.out.println("Person purchased car");
	}
}

public class PersonApplication1 {
	public static void main(String[] args) {
		Person1 p=new Person1();
		Car c = new Car();
		p.hasA(c);
		p.h.getHeart();
		p.b.getBrain();
		c.getCar();
		p=null;
		//p.h.getHeart();
		//p.b.getBrain();
		c.getCar();
	}
}
