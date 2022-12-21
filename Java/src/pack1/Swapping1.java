package pack1;

import java.util.Scanner;

public class Swapping1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("****Numbers Before Swapping****");
		System.out.println("a: "+a);	//a=10
		System.out.println("b: "+b);	//b=20
		
		System.out.println("****Numbers After Swapping****");
		//1st way swapping using temp variable
		System.out.println("1st Way of swapping");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a);	//a=20
		System.out.println("b: "+b);	//b=10
		
		//2nd way swapping using + and - operators
		System.out.println();
		System.out.println("2nd Way of swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);	//10
		System.out.println("b: "+b);	//20
		
		//3rd way swapping using * and / operators
		System.out.println();
		System.out.println("3rd Way of swapping");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a: "+a);	//20
		System.out.println("b: "+b);	//10
		
		//4th way swapping using single line
		System.out.println();
		System.out.println("4th Way of swapping");
		b=a+b-(a=b);
		System.out.println("a: "+a);	//10
		System.out.println("b: "+b);	//20
		sc.close();
	}
}
