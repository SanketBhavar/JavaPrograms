package pack1;

class Os{
	Os(){
		System.out.println("OS is Installed");
	}
	void checkOs() {
		System.out.println("OS is still Executing");
	}
}
class Charger{
	String name;
	Charger(String s){
		name=s;
		System.out.println("Charger Created");
	}
	void getCharger() {
		System.out.println("Charger can be used for charging");
	}
}
class Mobile {
	Os o=new Os();
	Mobile(){
		System.out.println("Mobile created with os installed");
	}
	void hasA(Charger c) {
		System.out.println("Charger accquired");
		System.out.println("Charger used for charging");
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
