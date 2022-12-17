package pack1;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int n,sum,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sum=0;
		while(n!=0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum of digit: "+sum);
		sc.close();
	}
}
