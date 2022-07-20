package pack1;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
	    int marks[];
	    marks= new int[5];
	    Scanner input= new Scanner(System.in);
	    marks[0]=input.nextInt();
	    marks[1]=input.nextInt();
	    marks[2]=input.nextInt();
	    marks[3]=input.nextInt();
	    marks[4]=input.nextInt();

	    int rollNumber;
	    rollNumber=input.nextInt();
	    System.out.println("The Student with Roll Number "+rollNumber+" has scored "+marks[rollNumber]+" marks");
	    input.close();
	}
}
