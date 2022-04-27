package pack1;

import java.util.Scanner;

public class Multithreading {
	public static void main(String[] args) {
		System.out.println("Task-1 Activity Started");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Task-1 Activity Completed");
		System.out.println("Task-2 Activity Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. to check even or odd");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		System.out.println("Task-2 Activity Completed");
		System.out.println("Task-3 Activity Started");
		System.out.println("Enter the no. to find Product");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Product of A*B= "+(a*b));
		System.out.println("Task-3 Activity Completed");
		sc.close();
	}
}
