package Day3;

public class NPZ
{
	int n = -10;


public static void main(String[] args)
{
	NPZ npz= new NPZ();
	if (npz.n>0)
	{
	System.out.println(npz.n+ "is positive number");
	}
	else if (npz.n<0)
	{
	
	System.out.println(npz.n+ "is negative number");
	}
	else {
		System.out.println(npz.n+ "is zero");
	}
	
}
}