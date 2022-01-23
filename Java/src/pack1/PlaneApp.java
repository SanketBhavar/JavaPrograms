package pack1;

class CargoPlane{
	void takeOff() {
		System.out.println("Plane Tookoff");
	}
	void fly() {
		System.out.println("Plane is Flying");
	}
	void carryCargo() {
		System.out.println("Carrying Cargo");
	}
	void land() {
		System.out.println("Plane is Landing");
	}
}

class PassengerPlane{
	void takeOff() {
		System.out.println("Plane Tookoff");
	}
	void fly() {
		System.out.println("Plane is Flying");
	}
	void carryPassenger() {
		System.out.println("Carrying Passengers");
	}
	void land() {
		System.out.println("Plane is Landing");
	}
}

class FighterPlane{
	void takeOff() {
		System.out.println("Plane Tookoff");
	}
	void fly() {
		System.out.println("Plane is Flying");
	}
	void carryWeapons() {
		System.out.println("Carrying Weapons");
	}
	void land() {
		System.out.println("Plane is Landing");
	}
}
public class PlaneApp {
	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		
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
		f.carryWeapons();
		f.land();
	}
}
