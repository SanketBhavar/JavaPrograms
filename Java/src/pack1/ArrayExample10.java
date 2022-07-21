package pack1;

import java.util.Scanner;

public class ArrayExample10 {
	static int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
	static int lastNonZeroDigit(int n) {
		if (n < 10)
			return dig[n];
	            
		if (((n / 10) % 10) % 2 == 0) 
			return (6 * lastNonZeroDigit(n / 5)* dig[n % 10]) % 10;
		else
			return (4 * lastNonZeroDigit(n / 5)* dig[n % 10]) % 10;
	   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(lastNonZeroDigit(n));
		s.close();
	}
}
