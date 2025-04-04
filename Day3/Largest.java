package Day3;

public class Largest {

	int a= 50;
	int b= 40;
	int c= 80;
	public static void main(String[] args) {
		
		Largest L = new Largest();
		
		if(L.a>L.b&&L.a>L.c)
		{
		System.out.println(L.a);
	}
	
		else if(L.b>L.a&&L.b>L.c) {
			System.out.println(L.b);
		}

	else
	{
		System.out.println(L.c);
		}
	}
	}