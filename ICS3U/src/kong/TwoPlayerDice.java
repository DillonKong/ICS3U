package kong;

import java.util.Scanner;

public class TwoPlayerDice {
	/*
	 * Two players, two dice Two dice are rolled for each the user and the
	 * computer. The winner is announced 23/3/16 
	 * Dillon Kong
	 */
	public static void main(String[] args) {

		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		boolean finished = false;
		String cont = null;

		while (!finished) 
		{
			int userDieOne = (int) (Math.random() * 6) + 1;
			int userDieTwo = (int) (Math.random() * 6) + 1;
			int compDieOne = (int) (Math.random() * 6) + 1;
			int compDieTwo = (int) (Math.random() * 6) + 1;
			int userTotal = userDieOne + userDieTwo;
			int compTotal = compDieOne + compDieTwo;

			System.out.println("Your two dice are: " + (userDieOne + userDieTwo));
			System.out.println("The computers two dice are: " + (compDieOne + compDieTwo));
			System.out.println("--------------------------------");

			if (userTotal > compTotal)
				System.out.println("You win");
			else if (userTotal < compTotal)
				System.out.println("You lose");
			else
				System.out.println("Tie");

			System.out.println("Do you want to continue? YES/NO");

			cont = scan.nextLine();

			if (cont.equals("YES"))
				finished = false;
			else
				finished = true;
		}
	}
}
