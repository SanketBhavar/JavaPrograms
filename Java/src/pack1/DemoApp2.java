package pack1;

interface Compute2{
	void add();
	void sub();
}

class Addition2 implements Compute2{
	public void add() {
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);
	}
	public void mul() {
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);
	}
}
public class DemoApp2 {
	public static void main(String[] args) {
		Addition2 a = new Addition2();
		Compute2 ptr;
		ptr=a;
		ptr.add();
		ptr.sub();//ptr.mul()     
    //gives error because mul() is not a interface method.
		((Addition2)(ptr)).mul();
	}
}
