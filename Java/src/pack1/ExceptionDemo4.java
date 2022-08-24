package pack1;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Demo4 d4=new Demo4();
		try {
			d4.fun1();
		}
		catch(Exception e) {
			System.out.println("Exception Caught in Main()");
		}
		System.out.println("Exiting Main Normally");
	}
}

class Demo4{
	void fun1()
	{
		System.out.println("Entering the fun1()");
		try {
			fun2();
		}
		catch(Exception e) {
			System.out.println("Caught in fun1()");
			throw e;
		}
	}
	void fun2()
	{
		System.out.println("Entering the fun2()");
		int a,b,c;
		a=10;
		b=0;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Caught in fun2()");
			throw e;
		}
	}
}
