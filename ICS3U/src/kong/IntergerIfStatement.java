package kong;

import java.util.Scanner;

public class IntergerIfStatement {
	/* Integer if statement
	 * Take integer from user and output whether it's positive/negative and divisible by 7
	 * 22/3/16
	 * Dillon Kong
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your integer?");
		
		//Set up variable
		int integer = Integer.parseInt(scan.nextLine());
		
		// Check whether positive or negative
		if (integer >= 0)
			System.out.println("Your integer is positive.");
		else 
			System.out.println("Your integer is negative.");
		
		// Check whether divisible by 7
		if (integer % 7 == 0 )
			System.out.println("Your integer is divisible by 7.");
		else 
			System.out.println("Your integer isn't divisible by 7. ");
	}
}


