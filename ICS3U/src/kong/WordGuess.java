package kong;

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String [] secretWord = {"Brain" , "Tree" , "Happy" , "Computer" , "Phone"};
		String [] letterGuess = new String [1];
		char [] secretDashes = {'-','-','-','-','-'}; //, "----" , "-----" , "--------" , "-----"};
		char [] letters = new char [5];
		char [] dashes = null;
		String guess = null, playAgain = null;
		int [] numGuesses = {0};

		int x =  (int) (Math.random() * secretWord.length);
		System.out.println("Word Guess Game ");

		@SuppressWarnings("unused")
		boolean play = true;
		{
			for  (int i = 0; i < secretWord[x].length(); i ++ )
			{
				System.out.print("-");
			}
			System.out.println(secretWord);
			
			if (!letterGuess [0].equalsIgnoreCase("!"))
			{
				while (secretDashes[0] == ('-') || secretDashes[1] == ('-') || secretDashes[2] == ('-') || secretDashes[3] == ('-') || secretDashes[4] == ('-'))
				{
					System.out.println("Enter a letter (! to guess the entire word):");
					letterGuess[0] = scan.next();

					if (x == 1)
					{
						if (letterGuess[0].equalsIgnoreCase("b"))
						{
							secretDashes [0] = 'B';
							numGuesses [0] ++;
						}
						else if (letterGuess[0].equalsIgnoreCase("r"))
						{
							secretDashes [1] = 'r';
							numGuesses[0] ++;
						}
						else if (letterGuess[0].equalsIgnoreCase("a"))
						{
							secretDashes [2] = 'a';
							numGuesses[0] ++;
						}
						else if (letterGuess[0].equalsIgnoreCase("i"))
						{
							secretDashes [3] = 'i';
							numGuesses[0] ++;
						}
						else if (letterGuess[0].equalsIgnoreCase("n"))
						{
							secretDashes [4] = 'n';
							numGuesses[0] ++;
						}
						
					}
				}
			}
			else if (letterGuess [1].equals("!"))
			{
				System.out.println("What's your guess");
				guess = scan.nextLine();
				if (guess.equalsIgnoreCase(secretWord[x]))
					System.out.println("You won!");
				else 
					System.out.println("You lost!");
			}

			System.out.println("Play again? (Yes or No)");
			playAgain = scan.nextLine();

			if (playAgain.equalsIgnoreCase("yes"))
				play = true;	
			else if (playAgain.equalsIgnoreCase("no"))
				play = false;
		}
	}

}
