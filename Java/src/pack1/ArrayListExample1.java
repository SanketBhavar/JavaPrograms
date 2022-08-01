package pack1;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<Float> random = new ArrayList<Float>();
		random.add(2f);
		random.add(4f);
		random.add(5f);
		random.add(10f);
		random.add(50f);
		random.add(99.9f);
		printList(random);
	}
	public static void printList(ArrayList<Float> arr) {
		for(Float a : arr) {		//for-each loop for printing ArrayList Elements
			System.out.println(a);
		}
	}
}
