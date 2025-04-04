import java.util.Scanner;

	public class Assignment_19 {
		static Scanner SC = new Scanner(System.in);
	    int GlobalVariable = 100;  // non-static global variable
	    static double GlobalStatic = 200.22; //static global variable
	    int GlobalVariableScan = SC.nextInt();    ////Scanner non-static global variable
	    static double GlobalStaticScan = SC.nextDouble();  //Scanner static global variable
	    
	    static void UseGlobalVariables() {   //Static Method
	    	Assignment_19 A=new Assignment_19();
	    	System.out.println("Print Non-static global variable in Static method: "+A.GlobalVariable);
	    	A.GlobalVariable =101;  //Updating non-static global variable
	    	System.out.println("Print Updated Non-static global variable in Static method: "+A.GlobalVariable);
	    	System.out.println("Print static global variable in Static method: "+GlobalStatic);
	    	System.out.println("Print Non-static global variable in Static method through scanner: "+A.GlobalVariableScan);
	    	System.out.println("Print static global variable in Static method: "+GlobalStaticScan);
	    }
	    void UseGlobalVariablesNonStatic() {  //Non-Static Method
	    	Assignment_19 A=new Assignment_19();
	    	System.out.println("Print Non-static global variable in Non-Static method: "+A.GlobalVariable);
	    	System.out.println("Print static global variable in Non-Static method: "+GlobalStatic);
	    	System.out.println("Print Non-static global variable in Non-Static method through scanner: "+A.GlobalVariableScan);
	    	System.out.println("Print static global variable in Non-Static method: "+GlobalStaticScan);
	    }

		public static void main(String[] args) {
			// WAP to declare a Global variable.
			Assignment_19 A=new Assignment_19();
			UseGlobalVariables();   //static Method Calling
			A.UseGlobalVariablesNonStatic();  //Non-static Method Calling
		}

	

	}

