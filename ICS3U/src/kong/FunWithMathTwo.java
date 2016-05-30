package kong;

import java.util.Scanner;

public class FunWithMathTwo {

	public static void main(String[] args) {
		int numOne = 0, numTwo = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("What's the first number?");
		numOne = scan.nextInt();
		System.out.println("What's the second number?");
		numTwo = scan.nextInt();
		System.out.println(add(numOne, numTwo));
		System.out.println(subtract(numOne, numTwo));
		System.out.println( multiply(numOne, numTwo));
		System.out.println( divide(numOne, numTwo));
	}

	public static int add (int numOne, int numTwo){
		return (numOne + numTwo);
	}

	public static int subtract(int numOne, int numTwo){
		return (numOne - numTwo);
	}

	public static int multiply(int numOne, int numTwo){
		return (numOne * numTwo);
	}

	public static int divide(int numOne, int numTwo){
		return (numOne / numTwo);
	}
}