package kong;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		char [] [] xAndO = { {' ' , ' ' , ' '} , {' ' , ' ' , ' '} , {' ' , ' ' , ' '} };
		int row, column;
		boolean win = false;

		while (win == false)
		{
			if ((xAndO [0] [0] == xAndO [0] [1]) && (xAndO [0] [1] == xAndO [0] [2]) &&  xAndO [0] [0] != ' ')
			{
				win = true;
				if (xAndO [0] [0] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}
			else if (xAndO [1] [0] == xAndO [1] [1] && xAndO [1] [1] == xAndO [1] [2] && xAndO [1] [0] != ' ' )
			{
				win = true;
				if (xAndO [1] [0] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}
			else if (xAndO [2] [0] == xAndO [2] [1] && xAndO [2] [1] == xAndO [2] [2] && xAndO [2] [0] != ' ')
			{
				win = true;
				if (xAndO [2] [0] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}

			else if (xAndO [0] [0] == xAndO [1] [0] && xAndO [1] [0] == xAndO [1] [1] && xAndO [0] [0] != ' ' )
			{
				win = true;
				if (xAndO [0] [0] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}
			else if (xAndO [0] [1] == xAndO [1] [1] && xAndO [1] [1] == xAndO [1] [2] && xAndO [0] [1] != ' ' )
			{
				win = true;
				if (xAndO [0] [1] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}
			else if (xAndO [0] [2] == xAndO [1] [2] && xAndO [1] [2] == xAndO [2] [2] && xAndO [0] [2] != ' ' )
			{
				win = true;
				if (xAndO [0] [2] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}

			else if (xAndO [0] [0] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [2] && xAndO [0] [0] != ' ' )
			{
				win = true;
				if (xAndO [0] [0] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}
			else if (xAndO [0] [2] == xAndO [1] [1] && xAndO [1] [1] == xAndO [2] [0] && xAndO [0] [2] != ' ' )
			{
				win = true;
				if (xAndO [0] [2] == 'X')

					System.out.println("Congradulations player one you win");	
				else
					System.out.println("Congradulations player two you win");
			}

			else {

				System.out.println("Player 1, you're Xs. Where woud you like to go? Row first then column place. \n Row (0-2)" );
				row = scan.nextInt();
				System.out.println("Column (0-2)");
				column = scan.nextInt();
				xAndO [row] [column] = 'X';

				System.out.println(xAndO [0] [0] + " | " + xAndO [0] [1] + " | " + xAndO [0] [2]);
				System.out.println("----------");
				System.out.println(xAndO [1] [0] + " | " + xAndO [1] [1] + " | " + xAndO [1] [2]);
				System.out.println("----------");
				System.out.println(xAndO [2] [0] + " | " + xAndO [2] [1] + " | " + xAndO [2] [2]);

				System.out.println("Player 1, you're Os. Where woud you like to go? Row first then column place. \n Row (0-2)" );
				row = scan.nextInt();
				System.out.println("Column (0-2)");
				column = scan.nextInt();
				xAndO [row] [column] = 'O';
				System.out.println(xAndO [0] [0] + " | " + xAndO [0] [1] + " | " + xAndO [0] [2]);
				System.out.println("----------");
				System.out.println(xAndO [1] [0] + " | " + xAndO [1] [1] + " | " + xAndO [1] [2]);
				System.out.println("----------");
				System.out.println(xAndO [2] [0] + " | " + xAndO [2] [1] + " | " + xAndO [2] [2]);
			}
		}
	}

}
