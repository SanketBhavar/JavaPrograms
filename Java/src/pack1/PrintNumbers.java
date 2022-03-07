package pack1;

import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		int n;
	    Scanner input= new Scanner(System.in);
	    n=input.nextInt();
	    int counter=1;
	    while (counter<=n){
	      System.out.println(counter);
	      counter=counter+1;
	   }
	    input.close();
	}
}
