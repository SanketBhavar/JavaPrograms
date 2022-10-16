package pack1;

import java.util.Scanner;

public class RemainderExample {
	public static void main(String args[]) {
	    Scanner scan = new Scanner(System.in);		
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
		int a = num1;
	    int b = num2;
		while (b != 0) {
	      int temp = b;
	      b = a % b;
	      a = temp;
	    }
	    System.out.println(a);    //remainder after performing division operation
	    scan.close();
	}
}
