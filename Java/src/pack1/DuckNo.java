package pack1;

import java.util.Scanner;

public class DuckNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		if(num.charAt(0)=='0') {
			System.out.println("Given Number is not a Duck Number");
		}
		else {
			if(num.contains("0")) {
				System.out.println("Given Number is Duck Number");
			}
			else {
				System.out.println("Given Number is not a Duck Number");
			}
		}
		sc.close();
	}
}
