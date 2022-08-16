package pack1;

public class DuckNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		if(num.charAt(0)=='0') {
			System.out.println("Given number is not a Duck Number");
		}
		else {
			if(num.contains("0")) {
				System.out.println("Given number is Duck Number");
			}
			else {
				System.out.println("Given number is not a Duck Number");
			}
		}
	}
}
