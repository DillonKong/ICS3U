package kong;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		boolean play = true;

		while (play == true) {
			//Initializes 2D array, 3 by 3 square
			String [] [] xAndO = { {" " , " " , " "} , {" " , " " , " "} , {" " , " " , " "}};
			//Initialize variables
			int row = 0, column = 0;
			boolean win = false;
			String playAgain = null;

			// Loop that'll run until there is a winner (win == false)
			while (win == false)
			{
				//Checks columns for winner. If true will set win to true
				if (xAndO [0] [0] == xAndO [0] [1] && xAndO [0] [1] == xAndO [0] [2] &&  xAndO [0] [0] != " ")
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win"); 
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				else if (xAndO [1] [0] == xAndO [1] [1] && xAndO [1] [1] == xAndO [1] [2] && xAndO [1] [0] != " " )
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win");
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				else if (xAndO [2] [0] == xAndO [2] [1] && xAndO [2] [1] == xAndO [2] [2] && xAndO [2] [0] != " ")
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win");
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				//Checks rows for winner. If true will set win to true 
				else if (xAndO [0] [0] == xAndO [1] [0] && xAndO [1] [0] == xAndO [2] [0] && xAndO [0] [0] != " " )
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win");
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				else if (xAndO [0] [1] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [1] && xAndO [0] [1] != " " )
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win");
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				else if (xAndO [0] [2] == xAndO [1] [2] && xAndO [1] [2] == xAndO [2] [2] && xAndO [0] [2] != " " )
				{
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [2] == "X")
						System.out.println("Congradulations player one you win");
					else
						System.out.println("Congradulations player two you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				//Checks the diagonals for winner. If true will set win to true
				else if (xAndO [0] [0] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [2] && xAndO [0] [0] != " " )
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win");
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				else if (xAndO [0] [2] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [0] && xAndO [0] [2] != " " )
				{	
					//Sets win to true to exit loop
					win = true;
					//Checks which player wins and prints the winner 
					if (xAndO [0] [0] == "X")
						System.out.println("Congradulations player X you win");
					else
						System.out.println("Congradulations player O you win");
					System.out.println("Would you like to play again? (Yes or No)");
					playAgain = scan.nextLine();
					if (playAgain.equalsIgnoreCase("yes"))
						play = true;
					else if (playAgain.equalsIgnoreCase("no"))
						play = false;
				}
				else if (xAndO [0] [0] != " " && xAndO [0] [1] != " " && xAndO [0] [2] != " "&& xAndO [1] [0] != " "&& xAndO [1] [1] != " "&& xAndO [1] [2] != " "&& xAndO [2] [0] != " "
						&& xAndO [2] [1] != " "&& xAndO [2] [2] != " ")
				{
					win = true;
					System.out.println("Cats game; there's no winner");
				}
				else 
				{
					//Asks for player X where they like to place an X
					System.out.println("Player X. Where woud you like to go? Row first then column place. \n Row (1-3)" );
					//Row is subtracted by 1 because in a array it starts at 0 not 1
					row = scan.nextInt();
					row --;
					System.out.println("Column (1-3)");
					//Column is subtracted by 1 because in a array it starts at 0 not 1
					column = scan.nextInt();
					column --;
					xAndO [row] [column] = "X";

					// Prints grid with updated X and O placement with grid numbers
					System.out.println("   " + "1" + "   2 " + "   3");
					System.out.println("1  " + xAndO [0] [0] + " | " + xAndO [0] [1] + " | " + xAndO [0] [2]);
					System.out.println("  ------------");
					System.out.println("2  " + xAndO [1] [0] + " | " + xAndO [1] [1] + " | " + xAndO [1] [2]);
					System.out.println("  ------------");
					System.out.println("3  " + xAndO [2] [0] + " | " + xAndO [2] [1] + " | " + xAndO [2] [2]);

					//Checks columns for winner. If true will set win to true
					if (xAndO [0] [0] == xAndO [0] [1] && xAndO [0] [1] == xAndO [0] [2] &&  xAndO [0] [0] != " ")
					{
						win = true;
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player one you win");
						else

							System.out.println("Congradulations player two you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					else if (xAndO [1] [0] == xAndO [1] [1] && xAndO [1] [1] == xAndO [1] [2] && xAndO [1] [0] != " " )
					{	
						//Sets win to true to exit loop
						win = true;
						//Checks which player wins and prints the winner 
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player X you win");
						else
							System.out.println("Congradulations player O you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					else if (xAndO [2] [0] == xAndO [2] [1] && xAndO [2] [1] == xAndO [2] [2] && xAndO [2] [0] != " ")
					{	
						//Sets win to true to exit loop
						win = true;
						//Checks which player wins and prints the winner 
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player X you win");
						else
							System.out.println("Congradulations player O you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					//Checks rows for winner. If true will set win to true
					else if (xAndO [0] [0] == xAndO [1] [0] && xAndO [1] [0] == xAndO [2] [0] && xAndO [0] [0] != " " )
					{
						win = true;
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player one you win");
						else
							System.out.println("Congradulations player two you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					else if (xAndO [0] [1] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [1] && xAndO [0] [1] != " " )
					{	
						//Sets win to true to exit loop
						win = true;
						//Checks which player wins and prints the winner 
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player X you win");
						else
							System.out.println("Congradulations player O you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					else if (xAndO [0] [2] == xAndO [1] [2] && xAndO [1] [2] == xAndO [2] [2] && xAndO [0] [2] != " " )
					{	
						//Sets win to true to exit loop
						win = true;
						//Checks which player wins and prints the winner 
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player X you win");
						else
							System.out.println("Congradulations player O you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					//Checks diagonals for winner. If true will set win to true
					else if (xAndO [0] [0] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [2] && xAndO [0] [0] != " " )
					{
						win = true;
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player one you win");
						else
							System.out.println("Congradulations player two you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					else if (xAndO [0] [2] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [0] && xAndO [0] [2] != " " )
					{	
						//Sets win to true to exit loop
						win = true;
						//Checks which player wins and prints the winner 
						if (xAndO [0] [0] == "X")
							System.out.println("Congradulations player X you win");
						else
							System.out.println("Congradulations player O you win");
						System.out.println("Would you like to play again? (Yes or No)");
						playAgain = scan.nextLine();
						if (playAgain.equalsIgnoreCase("yes"))
							play = true;
						else if (playAgain.equalsIgnoreCase("no"))
							play = false;
					}
					else if (xAndO [0] [0] != " " && xAndO [0] [1] != " " && xAndO [0] [2] != " "&& xAndO [1] [0] != " "&& xAndO [1] [1] != " "&& xAndO [1] [2] != " "&& xAndO [2] [0] != " "
							&& xAndO [2] [1] != " "&& xAndO [2] [2] != " ")
					{
						win = true;
						System.out.println("Cats game; there's no winner");
					}
					else
					{
						//Asks for player X where they like to place an X
						System.out.println("Player 2, you're Os. Where woud you like to go? Row first then column place. \n Row (1-3)" );
						//Row is subtracted by 1 because in a array it starts at 0 not 1 
						row = scan.nextInt();
						row --;
						System.out.println("Column (1-3)");
						//Column is subtracted by 1 because in a array it starts at 0 not 1
						column = scan.nextInt();
						column --;
						xAndO [row] [column] = "O";

						// Prints grid with updated X and O placement with grid numbers
						System.out.println("   " + "1" + "   2 " + "   3");
						System.out.println("1  " + xAndO [0] [0] + " | " + xAndO [0] [1] + " | " + xAndO [0] [2]);
						System.out.println("  ------------");
						System.out.println("2  " + xAndO [1] [0] + " | " + xAndO [1] [1] + " | " + xAndO [1] [2]);
						System.out.println("  ------------");
						System.out.println("3  " + xAndO [2] [0] + " | " + xAndO [2] [1] + " | " + xAndO [2] [2]);
					}
				}
			}
		}
	}
}