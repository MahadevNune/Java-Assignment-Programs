package Looping;

public class PrimenumberA {
static int n =2;
static int i = 50;


	public static void main(String[] args) {
		
   while(n<i && i<=150)
   {
	    	if(n%i != 0)//50==0//number ==0 not a prime//!=0 prime number
	    		{
	    		System.out.println(i + "is a prime number");
	    		}
	    		n++;
	    	}
	    	i++;
	}
	 
	}
   
