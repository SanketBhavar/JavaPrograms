package pack1;

import java.util.Scanner;

public class ThreeDArray {
	public static void main(String[] args) {
		int a[][][];
		a=new int[3][4][5];
		Scanner scan=new Scanner(System.in);
		int i,j,k;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				for(k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enter an Element");
					a[i][j][k]=scan.nextInt();
				}
			}
		}
		
		//Displying the Array Elements.
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				for(k=0;k<=a[i][j].length-1;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
}
