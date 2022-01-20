package pack1;

import java.util.Scanner;

class Farmer{
	float p,t,si;
	static float r;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a P");
		p=sc.nextFloat();
		System.out.println("Enter t");
		t=sc.nextFloat();
	}
	static {
		r=6.6f;
	}
	void calSI() {
		si=(p*t*r)/100;
	}
	void display() {
		System.out.println("Simple Interest is " +si );
	}
}

public  class FarmerApp {
	public static void main(String[] args) {
		Farmer f1,f2,f3;
		f1 = new Farmer();
		f2 = new Farmer();
		f3 = new Farmer();
		
		f1.input();
		f1.calSI();
		f1.display();

		f2.input();
		f2.calSI();
		f2.display();

		f3.input();
		f3.calSI();
		f3.display();
	}
}
