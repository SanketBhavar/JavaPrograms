package pack1;

import java.util.Scanner;

public class VotingApp {
	public static void main(String[] args) {
	    int age, vote;
	    Scanner input= new Scanner(System.in);
	    age=input.nextInt();
	    vote=input.nextInt();
	    if (age>=18){
	       if(vote==1)
	       {
	           System.out.println("You have voted for Ram");
	       }
	       else if(vote==2)
	       {
	           System.out.println("You have voted for Shyam");
	       }
	       else
	       {
	           System.out.println("You have voted for Ghanshyam");
	       }
	     }
	     else{
	        System.out.println("You are not eligible");
	     }
	    input.close();
	}
}
