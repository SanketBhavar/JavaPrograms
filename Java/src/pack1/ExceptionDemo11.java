package pack1;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "Your Age is Less Than 18..... Driving Liceanse cannot be Issued";
	}
}

class OverAgeException extends Exception{
	public String getMessage() {
		return "Your Age is Greater Than 60..... Driving Liceanse cannot be Given";
	}
}

class RTOApp{
	int age;
	void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age ");
	age=sc.nextInt();
	}
	
	void dispatchDL() {
		try {
			if(age<18) {
				throw new UnderAgeException();
			}
			else if(age>60) {
				throw new OverAgeException();
			}
			else {
				System.out.println("Collect Your Driving Liceanse...");
			}
		}
		catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(OverAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ExceptionDemo11 {
	public static void main(String[] args) {
		RTOApp r = new RTOApp();
		r.input();
		r.dispatchDL();
	}
}
