package pack1;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][];
		a=new int[3][4];
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				System.out.println("Enter an element");
				a[i][j]=sc.nextInt();
			}
		}
		//Displaying the Elements
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
