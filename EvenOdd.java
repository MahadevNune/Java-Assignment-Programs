import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input :");
		int Input =scanner.nextInt();
		if(Input%2==0) {
		System.out.println("Output :Given number is Even" );	

	}
		else {
			System.out.println("Output :Given number is Odd");
		}
		
	scanner.close();
}
}
