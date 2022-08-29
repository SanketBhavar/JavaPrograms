package pack1;

public class ExceptionDemo6 {
	public static void main(String[] args) {
		System.out.println("Main Connected to DataBase");
		Demo6 d6=new Demo6();
		try {
			d6.fun1();
		}
		catch(Exception e) {
			System.out.println("Exception Caught in main");
		}
		finally {
			System.out.println("Closing Connection by Main");
		}
	}
}
class Demo6{
	void fun1() {
		System.out.println("Fun1 Connected to DataBase");
		try {
			fun2();
		}
		catch(Exception e) {
			System.out.println("Exception Caught in Fun1");
			throw e;
		}
		finally {
			System.out.println("Closing Connection by Fun1");
		}
	}
	void fun2() {
		System.out.println("Fun2 Connected to DataBase");
		try {
			int a,b,c;
			a=10;
			b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception Caught in Fun2");
			throw e;
		}
		finally {
			System.out.println("Closing Connection by Fun2");
		}
	}
}
