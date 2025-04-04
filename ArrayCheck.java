import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Please enter the size of array1");
		int i=S.nextInt();
		int[] Array1 = new int[i];
		System.out.println("Please enter the size of array2");
		int j=S.nextInt();
		int[] Array2 = new int[j];
		for (i=0,j=0;i<Array1.length;i++,j++) {
			System.out.println("Please enter the value of Array 1 at index position "+i);
			Array1[i]=S.nextInt();
			System.out.println("Please enter the value of Array 2 at index position "+j);
			Array2[j]=S.nextInt();
		}
		System.out.println("Array 1 is :" + Arrays.toString(Array1));
		System.out.println("Array 2 is :" + Arrays.toString(Array2));
		if(Arrays.equals(Array1, Array2) == true)
		{
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both arrays are not equal");
		}
		
	}

}
