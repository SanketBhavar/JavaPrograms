package pack1;

import java.util.Scanner;

public class FunctionExample1 {
	public static int powerfunc(int base, int power) {
        if(power==0)
         return 1;
     else 
         return (base*powerfunc(base,power-1)); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d", powerfunc(a, b));
        sc.close();
    }

}
