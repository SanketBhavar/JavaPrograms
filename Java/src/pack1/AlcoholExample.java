package pack1;

import java.util.Scanner;

public class AlcoholExample {
	public static void main(String[] args) {
	    int age;
	    Scanner input= new Scanner(System.in);
	    age=input.nextInt();
	    if (age>=21)
	    {
	        System.out.println("***You are Eligible to Consume Alcohol***");
	    }
	    else
	    {
	        System.out.println("You are Not Eligible to Consume Alcohol. Go Home Kid!!!");
	    }
	    input.close();
	}
}
