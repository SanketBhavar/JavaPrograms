package pack1;

public class CafeApp {
	public static void main(String args[]){
		 int code;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter your Choice:");
		 code = input.nextInt();
		 
		switch(code) {
		case 1 :
		      System.out.println("Preparing Cappuccino");
		      break;
		case 2:
		      System.out.println("Preparing Espresso");
		      break;
		case 3:
		      System.out.println("Preparing Latte");
		      break;
		case 4:
		      System.out.println("Preparing Milk");
		      break;
		default:
		     System.out.println("Drink not Available");
		}
	}
}
