package pack1;

public class RecursionExample3 {
	static void function(int n) {
		if(n>0) {
			function(n-1);
			function(n-1);
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		int n=3;
		function(n);
	}
}
