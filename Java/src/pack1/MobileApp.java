package pack1;

class Os{
	Os(){
		System.out.println("OS is Installed");
	}
	void checkOs() {
		System.out.println("OS is Still Executing");
	}
}

class Charger{
	String name;
	Charger(String s){
		name=s;
		System.out.println("Charger Created");
	}
	void getCharger() {
		System.out.println("Charger Can Be Used For Charging");
	}
}

class Mobile {
	Os o=new Os();
	Mobile(){
		System.out.println("Mobile Created With OS Installed");
	}
	void hasA(Charger c) {
		System.out.println("Charger Accquired");
		System.out.println("Charger Used For Charging");
	}
}

public class MobileApp {
	public static void main(String[] args) {
		Mobile m;
		m=new Mobile();
		Charger c;
		c=new Charger("Iphone");
		m.hasA(c);
		m.o.checkOs();
		c.getCharger();
		m=null;
	//	m.o.checkOs();
		c.getCharger();
	}
}
