import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Please enter the size of array1");
		int i=S.nextInt();
		int[] Array1 = new int[i];
		double sum=0;
		double avg;
		
		for (i=0;i<Array1.length;i++) {
			System.out.println("Please enter the value of Array 1 at index position "+i);
			Array1[i]=S.nextInt();
			sum=sum+Array1[i];
		}
		System.out.println("Array 1 is :" + Arrays.toString(Array1));
		avg=sum/Array1.length;
		System.out.println("Sum of valu is "+sum);
		System.out.println("Average is :"+avg);
	
		
	}

}
