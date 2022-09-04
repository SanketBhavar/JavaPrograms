package pack1;

import java.util.Scanner;

public class FunctionExample {
	public static int sum(int n){
	    if (n!= 0)
	            return n + sum(n - 1);
	        else
	            return n;
	  }
	   public static void main(String args[]){
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       if (n>0){
	           int value = FunctionExample.sum(n);
	           System.out.print(value);
	       }
	       else{
	            System.out.println("Enter a natural number");
	       }
	       sc.close();
	}
}
