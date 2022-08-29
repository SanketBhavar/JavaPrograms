package pack1;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=5;
		int c;
		try {
			c=a/b;
			System.out.println(c);
			System.out.println("Try Executed");
			System.exit(0);                     //use of system.exit(0) - it exit from execution
		}
		catch(Exception e) {
			System.out.println("Problem in Division");
		}
		finally {
			System.out.println("Finally Executed");
		}
	}
}
