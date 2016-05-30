package kong;

import java.util.Scanner;

public class FunWithMath {

	public static void main(String[] args) {
		int numOne = 0, numTwo = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("What's the first number?");
		numOne = scan.nextInt();
		System.out.println("What's the second number?");
		
		numTwo = scan.nextInt();
		add(numOne, numTwo);
		subtract(numOne, numTwo);
		multiply(numOne, numTwo);
		divide(numOne, numTwo);
	}
	
	public static void add(int numOne, int numTwo){
		System.out.println(numOne + numTwo);
	}

	public static void subtract(int numOne, int numTwo){
		System.out.println(numOne - numTwo);
	}

	public static void multiply(int numOne, int numTwo){
		System.out.println(numOne * numTwo);
	}

	public static void divide(int numOne, int numTwo){
		System.out.println(numOne / numTwo);
	}
}