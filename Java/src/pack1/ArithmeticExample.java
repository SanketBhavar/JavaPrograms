package pack1;

import java.util.Scanner;

public class ArithmeticExample {
	public static void main( String[] args) 
	{
	    int a;
	    int b;
	    int c;
	    System.out.println("Enter values of A, B, C => ");
	    Scanner sc = new Scanner(System.in);
	    a= sc.nextInt();
	    b= sc.nextInt();
	    c= sc.nextInt();
	    System.out.println(a*b+c);
	    System.out.println(a+b-c);
	    sc.close();
	}
}
