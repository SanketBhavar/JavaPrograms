package pack1;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> random = new ArrayList<Integer>();          //An object named 'random' is created for the ArrayList class
		random.add(2);
		random.add(4);
		random.add(5);
		random.add(10);
		random.add(50);
		random.add(99);                             //Command for adding a new element
		printArray(random);
	}
	public static void printArray(ArrayList<Integer> arr) {
		for(Object a : arr) {          //The data type of an element of ArrayList taken to be 'random'
			System.out.println(a);
		}
	}
}
