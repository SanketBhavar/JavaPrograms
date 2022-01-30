package pack1;

abstract class Plane1{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class Cargo1 extends Plane1{
	void takeOff() {
		System.out.println("Cargo plane is Tookoff");
	}
	void fly() {
		System.out.println("Cargo plane is Flying");
	}
	void land() {
		System.out.println("Cargo plane is Landing");
	}
}

class Passenger1 extends Plane1{
	void takeOff() {
		System.out.println("Passenger plane is Tookoff");
	}
	void fly() {
		System.out.println("Passenger plane is Flying");
	}
	void land() {
		System.out.println("Passenger plane is Landing");
	}
}

class Fighter1 extends Plane1{
	void takeOff() {
		System.out.println("Fighter plane is Tookoff");
	}
	void fly() {
		System.out.println("Fighter plane is Flying");
	}
	void land() {
		System.out.println("Fighter plane is Landing");
	}
}

class Airport {
	void allowPlane(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class PlaneApplication1 {
	public static void main(String[] args) {
		Cargo1 c=new Cargo1();
		Passenger1 p= new Passenger1();
		Fighter1 f=new Fighter1();
		Airport a=new Airport();
		a.allowPlane(c);
		System.out.println();
		a.allowPlane(p);
		System.out.println();
		a.allowPlane(f);
	}
}
