package pack1;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Element");
		a=sc.nextInt();
		System.out.println("Enter an Element");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum of two numbers: "+c);
		sc.close();
	}
}
