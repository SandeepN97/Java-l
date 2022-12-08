package exceptionHandling;

import java.util.*;
//runtime error is exception 
//arithmenticException


//try catch finally throw throws = keywords for exception handling in java 

//Exception class hierarchy

// throwable = exception   - 
//             error  - are not recoverable error


//the use of try and catch 

//finally is always executing - if any exception comes and try cannot catch the exception then finally will be executed but nothing after that

public class Runtime {
	public void main (String[] arg) {
		Scanner sc = new Scanner (System.in);
		
		int finalNumber = 0;
		
		System.out.println("Enter num 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num 2: ");
		int num2 = sc.nextInt();
		
	    System.out.println("Computation result is: ");
	    try {
	    	finalNumber = num1/num2;
	    }
	    catch (Exception ex) {
	    	System.out.println("Num 2 cannot be zoro. "  +  ex.getMessage());
	    }
	    
	    System.out.println("The final Number is: " + finalNumber);
	    System.out.println("The output Here. ");
		
	} 
}
