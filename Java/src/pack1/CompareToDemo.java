package pack1;

import java.util.Scanner;

public class CompareToDemo {
	public static void main(String[] args) {
		String s1,s2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String1");
		s1=scan.next();
		System.out.println("Enter String2");
		s2=scan.next();
		
		int res;
		res=s1.compareTo(s2); 		//CompareTo() function for Comparing String1 and String2
		if(res==0) {
			System.out.println("s1 is equal to s2");
		}
		else {
			System.out.println("s1 is not equal to s2");
		}
	scan.close();
	}
}
