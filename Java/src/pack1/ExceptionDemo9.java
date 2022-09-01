package pack1;

import java.util.Scanner;

public class ExceptionDemo9 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of a");
		a=sc.nextInt();
		System.out.println("Enter a value of b");
		b=sc.nextInt();
		try {
			if(a>b) {
				c=a-b;
				System.out.println(c);
			}
			else {
				Exception e=new Exception();   //build custom exception
				throw e;
			}
		}
		catch(Exception e) {
			System.out.println("sub not possible");
		}
		System.out.println("Exiting main normally");
    sc.close();
	}
}
