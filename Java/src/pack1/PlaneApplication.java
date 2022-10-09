package pack1;

class Plane{
	void takeOff() {
		System.out.println("Plane Tookoff");
	}
	void fly() {
		System.out.println("Plane is Flying");
	}
	void land() {
		System.out.println("Plane is Landing");
	}
}
class Cargo extends Plane{
	void carryCargo() {
		System.out.println("Carrying Cargo");
	}
}
class Passenger extends Plane{
	void carryPassenger() {
		System.out.println("Carrying Passengers");
	}
}
class Fighter extends Plane{
	void carryWeapon() {
		System.out.println("Carrying weapons");
	}
}

public class PlaneApplication {
	public static void main(String[] args) {
		Cargo c = new Cargo();
		Passenger p = new Passenger();
		Fighter f= new Fighter();
		
		c.takeOff();
		c.fly();
		c.carryCargo();
		c.land();
		System.out.println();
		p.takeOff();
		p.fly();
		p.carryPassenger();
		p.land();
		System.out.println();
		f.takeOff();
		f.fly();
		f.carryWeapon();
		f.land();
	}
}
