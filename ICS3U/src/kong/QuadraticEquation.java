package kong;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
	/* Quadratic Equation
	 * Take a,b and c from user and output both answers using the quadratic equation
	 * 10/3/16
	 * Dillon Kong
	 */
	public static void main(String[] args) {
		//Set up scanner
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		//Variables
		double answerOne;
		double answerTwo;
		//User input (a,b,c)
		System.out.println ("What is the value of a?");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println ("What is the value of b?");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println ("What is the value of c?");
		int c = Integer.parseInt(scan.nextLine());
		
		// Root one; with addition
		answerOne = b * b - (4 * a * c );
		answerOne = Math.sqrt(answerOne);
		answerOne = (b * -1) + answerOne;
		answerOne = answerOne / (2 * a);
		
		//Root two; with subtraction
		answerTwo = b * b - (4 * a * c );
		answerTwo = Math.sqrt(answerTwo);
		answerTwo = (b * -1) - answerTwo;
		answerTwo = answerTwo / (2 * a);
		
		//Output roots to the tenth decimal places
		System.out.println("The first root is = " + df.format(answerOne));
		System.out.println("The second root is = " + df.format(answerTwo));
		
	}

}
