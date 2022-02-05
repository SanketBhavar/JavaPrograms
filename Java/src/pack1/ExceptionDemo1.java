package pack1;

import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a value of a");
		a=sc.nextInt();
		System.out.println("Enter a value of b");
		b=sc.nextInt();
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Problem in Division");
		}
		System.out.println("Existing main normally");
		sc.close();
	}
}
