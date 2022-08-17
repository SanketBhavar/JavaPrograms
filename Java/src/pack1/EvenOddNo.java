package pack1;

import java.util.Scanner;

class EvenOddNo{
	public static void main(String[] args) {
		int n;
		Scanner input= new Scanner(System.in);
		n=input.nextInt();
		if (n%2==0){
			System.out.println("The number entered is even");
		}
		else{
			System.out.println("The number entered is odd");
		}
	input.close();
   }
}
