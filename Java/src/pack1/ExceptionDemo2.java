package pack1;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i;
		for(i=0;i<=a.length-1;i++) {
			System.out.println("Enter an Element");
			a[i]=sc.nextInt();
		}
		try {
			for(i=0;i<=10;i++) {
				System.out.println(a[i]);
			}
		}
		catch(Exception e) {
			System.out.println("Problem in Accessing an Array");
		}
		System.out.println("Existing main normally");
		sc.close();
	}
}
