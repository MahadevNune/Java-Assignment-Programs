import java.util.Scanner;

public class days {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Day");
		String day=scanner.nextLine().toUpperCase() ;
		switch(day) {
		case "MONDAY":
			System.out.println("uff its weekday");
			break;
		case "TUESDAY":
			System.out.println("uff its weekday");
			break;
		case "wednesday":
			System.out.println("uff its weekday");
			break;
		case "Thursday":
			System.out.println("uff its weekday");
			break;
		case "Friday":
			System.out.println("uff its weekday");
			break;
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("uff its weekend");
		default:
			System.out.println("uff its day");
			
		}
		
		scanner.close();
	}

}
