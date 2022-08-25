package pack1;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("Main Connected to DataBase");
		Demo5 d5=new Demo5();
		try {
			d5.fun1();
		}
		catch(Exception e) {
			System.out.println("Exception Caught in main");
		}
	}
}

class Demo5{
	void fun1() {
		System.out.println("Fun1 Connected to DataBase");
		try {
			fun2();
		}
		catch(Exception e) {
			System.out.println("Exception Caught in Fun1");
			throw e;
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
	}
}
