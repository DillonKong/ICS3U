package kong;

import java.util.Scanner;

	public class num1 {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			int [] coins = new int [5];
			
			for (int i = 0; i < 5; i ++)
			{
				coins [i] = scan.nextInt();
			}
			int total = coins [0] * 5 + coins [1] * 10 + coins [2] * 25 + coins [3] * 100 + coins [4] * 200;
			System.out.println(total);
				
		
		}
	
	}
