package Switch;

import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enetr the input");
		int i =scanner.nextInt();
		switch(i%2) {
		case 0:
		System.out.println("given number is even");
		break;		
	case 1:
		System.out.println("given number is odd");
		break;
			
		}

	}
	}

