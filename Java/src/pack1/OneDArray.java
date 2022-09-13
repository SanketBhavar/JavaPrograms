package pack1;

import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		int a[];
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
		}
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	sc.close();
	}
}
