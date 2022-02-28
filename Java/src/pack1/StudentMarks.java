package pack1;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		String name;
	    int marks;
	    Scanner input = new Scanner(System.in);
	    name = input.nextLine();
	    marks = input.nextInt();
	    if(marks>=75 && marks<=100)
	    {
	    	System.out.println("The grade scored by " + name + " is A");	//First Class with Distinction
	    }
	    else if(marks>=60 && marks<75)
	    {
	        System.out.println("The grade scored by " + name + " is B");	//First Class
	    }
	    else if(marks>=50 && marks<60)
	    {
	        System.out.println("The grade scored by " + name + " is C");	//Second Class
	    }
	    else if(marks<=35)
	    {
	        System.out.println("The grade scored by " + name + " is D");	//Pass Class
	    }
	    else 
	    {
	        System.out.println("The grade scored by " + name + " is F");	//Fail
	    }
	    input.close();
	}
}
