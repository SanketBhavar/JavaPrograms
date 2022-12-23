package pack1;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
	    int C, F;
	    Scanner input= new Scanner(System.in);
	    System.out.println("Enter Temperature in Celcius");
	    C=input.nextInt();
	    F=9*C/5+32;
	    System.out.println("Celcius to Fahrenheit: "+F);
	    input.close();
   }
}
