package pack1;

import java.lang.Math;

public class ArrayExample4 {
	public static void main(String[] args) { 
		double[] array = {10.32,20.36,30.50,40.51,50.49,60.43,71.71};

		for(int i = 0; i <  array.length; i++) {
			array[i]=Math.sqrt(array[i]);
		}
		System.out.println("Math.sqrt() Function");
		for(int i = 0; i <  array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
