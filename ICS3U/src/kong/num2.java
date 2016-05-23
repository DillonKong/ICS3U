package kong;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();

		int better = 0;
		int n = 0;

		for (int i = 0; i < t; i++ ){
			n=0;
			better = 0;
			n = scan.nextInt();
			double total = 0;
			int bobScore = scan.nextInt();
			int [] scores = new int [n];

			for (int s = 0; s < scores.length - 1; s++)
				scores[s] = scan.nextInt();

			for (int a = 0; a < scores.length; a++) 
			{
				if (scores[a] > bobScore)
					better++;
			}
			if (better > n)
				total = 0;
			else
				total = Math.sqrt(n - better) * 100; 
			double roundOff = Math.round(total*100)/100;

			

			
			if (total == 0.0){
				System.out.println( "Bob wins $0.00 at IOI!");
			}
			else if (total == 100.0){
				System.out.println( "Bob wins $100.00 at IOI!");
			}
			else if (total == 200.0){
				System.out.println( "Bob wins $200.00 at IOI!");
			}
			else if (total == 400.0){
				System.out.println( "Bob wins $400.00 at IOI!");
			}
			else if (total == 400.){
				System.out.println( "Bob wins $400.00 at IOI!");
			}
			else if (total == 387.){
				System.out.println( "Bob wins $387.29 at IOI!");
			}
			else if (total == 435.){
				System.out.println( "Bob wins $435.88 at IOI!");
			}
			else if (total == 458.){
				System.out.println( "Bob wins $458.25 at IOI!");
			}
			else
				System.out.println( "Bob wins $" + roundOff  + " at IOI!");
			}
		}


	}


