package pack1;

class A{
	int i;
}

class B extends A{
	int i;
	void setData(int x, int y) {
		super.i=x;
			  i=y;
	}
	void display() {
		System.out.println("A's i is "+super.i);
		System.out.println("B's i is "+i);
	}
}
public class SuperKey {
	public static void main(String[] args) {
		B b1;
		b1=new B();
		b1.setData(10, 20);
		b1.display();
	}
}
