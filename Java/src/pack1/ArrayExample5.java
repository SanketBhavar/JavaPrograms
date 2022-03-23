package pack1;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		System.out.println("Enter the no. of elements :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (i = 0; i < n; i++) {
        	arr[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            int swap = 0;
            for (int j = 1; j < n - i; j++) {
            	if (arr[j - 1] > arr[j]) {
            		int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = 1;
                }
            }
            if (swap == 0) {
                    break;
                }
        }
        
        System.out.println("sorted array ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}
