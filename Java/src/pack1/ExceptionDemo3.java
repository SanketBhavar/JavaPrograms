package pack1;

class Demo3{
	void fun1()
	{
		System.out.println("Entering the fun1()");
		fun2();
	}
	void fun2()
	{
		System.out.println("Entering the fun2()");
		
		int a,b,c;
		a=10;
		b=0;
		c=a/b;
		System.out.println(c);
	}
}

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Demo3 d3=new Demo3();
		try {
			d3.fun1();
		}
		catch(Exception e) {
			System.out.println("Exception Caught in Main()");
		}
		System.out.println("Exiting Main Normally");
	}
}
