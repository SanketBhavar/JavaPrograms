package pack1;

import java.util.Scanner;

public class PositiveNo {
	 public static void main(String[] args) {
		 int n;
		 Scanner input= new Scanner(System.in);
		 n=input.nextInt();
		 if (n>0){
			System.out.println("The Number Entered is Positive Number");
		 }
		 else{
			System.out.println("The Number Entered is Negative Number");
		 }
		 input.close();
	 }
}
