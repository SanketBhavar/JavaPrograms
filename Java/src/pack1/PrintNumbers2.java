package pack1;

import java.util.Scanner;

public class PrintNumbers2 {
	public static void main(String[] args) {
		int n;
	    Scanner input= new Scanner(System.in);
	    n=input.nextInt();
	    int counter=1;
	    while (counter<=n)
	    {
	    	System.out.println(counter);
	        counter=counter+2;
	   }
	    input.close();
	}
}
