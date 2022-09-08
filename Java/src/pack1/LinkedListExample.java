package pack1;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Float> random = new LinkedList<Float>();
		random.add(2f);
		random.add(4f);
		random.add(5f);
		random.add(10f);
		random.add(99f);
		//index 2 element
		System.out.println(random.get(2));
		//first element of linked list
		System.out.println(random.getFirst());
		//last element of linked list
		System.out.println(random.getLast());
	}
}
