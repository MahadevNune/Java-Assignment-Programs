import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input");
		int input = scanner.nextInt();
		if (input<35) 
			System.out.println("fail");
		 if(input==35) 
			System.out.println("pass");
		 if(input>35&&70<input) 
			System.out.println("third calss");
		 if(input<70&&85<input) 
			System.out.println("second calss");
		 if(input>85) 
			System.out.println("first class");

		if(input<35)
			System.out.println("student is failed");

		scanner.close();
	}


}

