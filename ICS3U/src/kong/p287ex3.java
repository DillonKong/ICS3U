package kong;

import java.util.Scanner;

public class p287ex3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = 0;
		double  y = 0; 
		t = scan.nextInt();
		double x [] = new double [t];


		for (int i = 0; i <= t-1; i ++)
		{
			x [i] = scan.nextDouble();
		}

		for (int i = 1; i <= t; i++)
		{
			if (x [i - 1] < x [i])
			{
				y = x[i-1];
			}
			else 
				y = x[i];
		}
		System.out.println(y);
	}

}
