package pack1;

import java.util.Scanner;

public class ExceptionDemo10 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		try {
			if(a>b) {
				c=a-b;
				System.out.println(c);
			}
			else {
				throw new ALessThanBException();
			}
		}
		catch(ALessThanBException e) {
			System.out.println("Subtraction Not Possible...");
		}
		System.out.println("Exiting Main Normally");
	}
}
class ALessThanBException extends Exception
{
	ALessThanBException(){
		System.out.println("A is less than B");
	}
}
