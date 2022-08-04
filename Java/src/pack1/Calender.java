package pack1;



public class Calender {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		int date = scan.nextInt();
		int day = 0;
		switch (month) {
			case "January":
				day = date;
				break;
			case "February":
				day = 31 + date;
				break;
			case "March":
				day = 31 + 28 + date;
				break;
			case "April":
				day = 31 + 28 + 31 + date;
				break;
			case "May":
				day = 31 + 28 + 31 + 30 + date;
				break;
			case "June":
				day = 31 + 28 + 31 + 30 + 31 + date;
				break;
			case "July":
				day = 31 + 28 + 31 + 30 + 31 + 30 + date;
				break;
			case "August":
				day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
				break;
			case "September":
				day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
				break;
			case "October":
				day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
				break;
			case "November":
				day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
				break;
			case "December":
				day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
				break;
			default:
				System.out.println("Invalid input");
		}
		int dayNumber = day % 7;
		if (dayNumber == 0 || dayNumber == 6) {
			System.out.print("Hurray!");
		} else {
			System.out.print("Ohhh! It's a work day :|");
		}
		
	}	
}
