package pack1;

interface Compute{
  void add();
	void sub();
}

//Interface in Java
class Addition1 implements Compute{
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
}
public class DemoApp1 {
	public static void main(String[] args) {
		Addition1 a = new Addition1();
		Compute ptr;
		ptr=a;
		ptr.add();
		ptr.sub();
	}
}
