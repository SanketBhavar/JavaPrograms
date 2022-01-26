package pack1;

class PlaneD{
	void land() {
		System.out.println("Plane landed");
	}
}

class FighterD extends PlaneD{
	void land() {
		System.out.println("Fighter Plane Landed");
	}
	void launchMissile() {
		System.out.println("Missile Launched");
	}
}
public class PlaneDemo {
	public static void main(String[] args) {
		FighterD f=new FighterD();
		PlaneD ref;
		ref=f;
		ref.land();
		//ref.launchMissile(); ---> Error
		((FighterD)(ref)).launchMissile();
	}
}
