package pack1;

public class ExceptionDemo8 {
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exiting Main Normally");
	}
}
