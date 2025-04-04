package Switch;

import java.util.Scanner;

public class Arthemetic {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter fisrt number");
       int i= scanner.nextInt();
       System.out.println("Enter second number");
       int j= scanner.nextInt();
       System.out.println("Enter the target operation");
       char c = scanner.next().charAt(0);
       //System.out.println("output");
     // int o = scanner.nextInt();
      
      switch (c)
      {
    	  case '+':
    		  System.out.println(i+j);
    		  break;
    	  case '-':
    		  System.out.println(i-j);
    		  break;
    	  case '*':
    		  System.out.println(i*j);
    		  break;
    	  case '/':
    		  System.out.println(i/j);
    		  break;
    		  
    		  default:
        		  System.out.println("Please enter valid operation");
        		  break;
    		  
    	  
      }
    	  
      }

	}


