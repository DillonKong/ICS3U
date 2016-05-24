package kong;

import java.util.Scanner;

public class FunWithMathTwo {
	
	public static  int numOne = 0, numTwo = 0, total = 0;
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {

		getNumbers();
		add();
		System.out.println(total);
		subtract();
		System.out.println(total);
		multiply();
		System.out.println(total);
		divide();
		System.out.println(total);
	}

	public static void getNumbers(){
		System.out.println("What's the first number?");
		numOne = scan.nextInt();
		System.out.println("What's the second number?");
		numTwo = scan.nextInt();
	}

	public static void add(){
		total = numOne + numTwo;
		
	}

	public static void subtract(){
		total = numOne - numTwo;
	}

	public static void multiply(){
		total = numOne * numTwo;
	}

	public static void divide(){
		total = numOne / numTwo;
	}
}