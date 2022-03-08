package pack1;

import java.util.Scanner;

public class PrintNumbers1 {
	public static void main(String[] args) {
		int n;
	    Scanner input= new Scanner(System.in);
	    n=input.nextInt();
	    int counter=0;
	    while (counter<=n)
	    {
	    	System.out.println(counter);
	    	counter=counter+2;
	   }
	    input.close();
	}
}
