package Looping;

public class Primenumber {
	static int i = 2;
	static int n= 50;
	
	public static boolean pime() {
		
		
	    boolean check = false;
	    while(i<=n && n<=150)
	    	
	    {
	    	
	    	while(n%i != 0) {
	    		
	    		//System.out.println(n + " is a prime number");
	    		i++;
	    		check = true;
	    		  	}
	    	
	    	n++;
	    	
	    	
	}
		return check;
	}

	public static void main(String[] args) {
		Primenumber P = new Primenumber();
		if (pime() == false) {
			System.out.println(n + " is not a prime");
		}else
			System.out.println(n + " is a Prime number");
    
 
    	}
    	
    }
 

	


