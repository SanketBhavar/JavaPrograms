package pack1;

public class PrintAlphabets {
	public static void main(String[] args) {
		System.out.println("Small Alphabets");
		int counter = 97;
	    while (counter <= 122) {
	        System.out.print((char) counter+ " ");
	        counter = counter + 1;
	    }
	    System.out.println("\n");
	    System.out.println("Capital Alphabets");
	    int ch = 65;
	    while (ch<=90) {
	        System.out.print((char) ch+ " ");
	        ch = ch + 1;
	    }
	}
}
