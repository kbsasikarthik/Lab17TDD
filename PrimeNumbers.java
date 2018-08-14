//@ Sasi & Amna

// This program uses Test Driven Development practices
// It utilizes the Validator class to validate the input from the user.
package lab17TDD;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n, result;
		String choice="y";
		
		// print welcome messages
		System.out.println("Let's locate some primes!");
		System.out.println("\nThis application will find you any prime, in order, from first prime number on.");
		
		// loops when the user wants to agree
		while(choice.equalsIgnoreCase("y")) {
			
			// get the number from the user to find out the prime number in that position
			n = Validator.getInteger(sc, "\nWhich prime number are you looking for? : ");
			sc.nextLine();
			
			// call the user-defined method prime which takes in a number and gives back the prime number
			// accordingly
			result = prime(n);
			
			// print the result
			System.out.println("\nThe prime number at place "+n+" is "+result);
			
			// check if the user wants to continue
			choice = Validator.getRegExString(sc, "\nWould you like to continue? : ", "Y|y|n|N");
		}
		// display concluding message
		System.out.println("\nThanks for trying. Goodbye!");
	} // end of main
	
// this user-defined method will take a number as argument and loops that number of times and returns the 
// prime number at the end of the loop
	public static int prime(int n){
		int num, count, i;
	    num=1;
	    count=0;
	    
	    while (count < n){
	      num=num+1;
	      for (i = 2; i <= num; i++){
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        count = count+1;
	      }
	    }
		return num;
	}// end of prime method

} // end of class
