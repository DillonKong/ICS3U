package kong;

import java.util.Scanner;

public class ArithmeticExpressions {
	/*MothersAge
	 * Does 7 different numbers inputed by the user and different equations are done to them.
	 * 8/3/16
	 * Dillon Kong
	 */
	public static void main(String[] args) {
		
		//setup scanner
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		//Input of the 5 numbers from user
		System.out.println("Please input your first number");
		int numberOne = Integer.parseInt(scan.nextLine());
		System.out.println("Please input your second number");
		int numberTwo = Integer.parseInt(scan.nextLine());
		System.out.println("Please input your third number");
		int numberThree = Integer.parseInt(scan.nextLine());
		System.out.println("Please input your forth number");
		int numberFour = Integer.parseInt(scan.nextLine());
		System.out.println("Please input your fifth number");
		int numberFive = Integer.parseInt(scan.nextLine());
		
		// 7 different equation
		int equationOne = numberOne + numberTwo + numberThree + numberFour + numberFive;
		System.out.print("1) The sum of the five numbers = ");
		System.out.println(equationOne);
		
		int equationTwo = numberTwo - numberThree;
		System.out.print("2) Second number subtracted from the third number = ");
		System.out.println(equationTwo);
		
		int equationThree = numberOne * numberFive;
		System.out.print("3) The product of the first and fifth number = ");
		System.out.println(equationThree);
		
		int equationFour = numberFour / numberTwo;
		System.out.print("4) The quotient of the fourht number divided by the second number= ");
		System.out.println(equationFour);
		
		int equationFive = numberFour % numberTwo ;
		System.out.print("5) The remainder of the forth and scond number when divided = ");
		System.out.println(equationFive);
		
		int equationSix = numberThree ^ numberOne;
		System.out.print("6) First number to the power of the third number = ");
		System.out.println(equationSix);
		
		double equationSeven = Math.sqrt(numberFive);
		System.out.print("7) Square root of the fifth number = ");
		System.out.println(equationSeven);
	}

}
