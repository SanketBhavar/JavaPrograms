package pack1;

public class RecursionExample4 {
	static void function(int n) {
		if(n>0) {
			System.out.println(n);
			function(n-1);
			function(n-1);
		}
	}
	
	public static void main(String[] args) {
		int n=3;
		function(n);
	}
}
