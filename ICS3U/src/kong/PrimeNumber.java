package kong;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a number.");
		int number = scan.nextInt();

		if (number==1)
			System.out.println(number + " is not prime");
		else
			System.out.println(isDivisable(number));
	}
	public static String isDivisable(int x)
	{
		boolean prime = false;
		for (int i=2;i!=x;i++)
		{
			if (x%i==0)
				prime=true;
		}
		if (prime)
			return "The number is not prime";
		else
			return "The number is prime";
	}

}
