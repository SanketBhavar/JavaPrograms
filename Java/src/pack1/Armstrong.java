package pack1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int n,n1,sum,digit;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		n=scan.nextInt();
		n1=n;
		sum=0;
		while(n!=0) {
			digit=n%10;
			sum=sum+(digit)*(digit)*(digit);
			n=n/10;
		}
		if(n1==sum)
		{
			System.out.println("The no. is an Armstrong no.");
		}
		else {
			System.out.println("The no. is a not Armstrong no.");
		}
		scan.close();
	}
}
