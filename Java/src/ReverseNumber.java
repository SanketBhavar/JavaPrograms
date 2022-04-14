

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		//1st Way
		int rev=0,rev1=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number: "+rev);
		sc.close();
	}
}
