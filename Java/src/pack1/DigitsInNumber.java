package pack1;

import java.util.Scanner;

public class DigitsInNumber {
	public static void main(String[] args) {
	       int n;
	       Scanner input= new Scanner(System.in);
	       n=input.nextInt();
	       int count=0;
	        do {
	           n = n/10;
	            count++;
	        } while (n!=0); 
		System.out.println(count);	//count the digits in number e.g. 6354 it shows 4 digits in this number
		input.close();
	}
}
