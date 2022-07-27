package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample8 {
    public static int[] sort(int[] randomNumbers) {
		return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    	}
    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);
            merge(numbers, first, mid, last);
        }
        return numbers;
    }
    private static int[] merge(int[] numbers, int i, int m, int j) {
        int l = i; 
        int r = m + 1; 
        int k = 0; 
        int[] t = new int[numbers.length];

        while (l <= m && r <= j) {
            if (numbers[l] > numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }
        // Copy the remaining elements on left half , if there are any
        while (l <= m) {
            t[k] = numbers[l];
            k++;
            l++;
        }
        // Copy the remaining elements on right half , if there are any
        while (r <= j) {
            t[k] = numbers[r];
            k++;
            r++;
        }
        // Copy the remaining elements from array t back the numbers array
        l = i;
        k = 0;
        while (l <= j) {
            numbers[l] = t[k];
            l++;
            k++;
        }
        return numbers;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
           randomNumbers[i] = scanner.nextInt();
       }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
        scanner.close();
    }
}
