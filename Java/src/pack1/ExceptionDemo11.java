package pack1;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "Your age is less than 18.....Driving Liceanse cannot be issued";
	}
}

class OverAgeException extends Exception{
	public String getMessage() {
		return "Your age is greater than 60.....Driving Liceanse cannot be given";
	}
}

class RTOApp{
	int age;
	void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
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
				System.out.println("Collect your Driving Liceanse...");
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
