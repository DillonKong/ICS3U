package kong;

import java.util.Scanner;

public class WordGuess1 {

	public static void main(String[] args) {
		// Initialize all variables
		String[] secretWords = new String[]{"brain", "tree" , "happy" , "computer" , "phone", "technology" , "charger" , "cars" , "music" , "screen" , "haircut" , "programming"};
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int randomWord = (int) (Math.random() * secretWords.length), counter = 0;
		boolean incomplete = true;
		String userGuess = "#", guessWord;
		char[] wordDashes = new char[secretWords[randomWord].length()];
		char[] wordOfsecretWords = secretWords[randomWord].toCharArray();

		System.out.println("Word Guessing Game");

		//Prints dashes for the random word
		for (int i = 0; i < secretWords[randomWord].length(); i++) 
			wordDashes[i] = '-';

		//User guesses letters until ! is inputed
		while (!userGuess.equalsIgnoreCase("!") && incomplete == true)
		{
			for(int i = 0; i < wordDashes.length; i++)	
			{
				if(wordOfsecretWords[i] == userGuess.charAt(0))
					wordDashes[i] = userGuess.charAt(0);

				System.out.print(wordDashes[i]);
			}

			for (int i = 0; i < wordDashes.length; i++) 
			{
				if (wordDashes[i] == '-') 
				{
					incomplete = true;
					break;
				}
				if (wordDashes[i] != '-') 
					incomplete = false;
			}
			System.out.println();
			if(incomplete)
			{
				System.out.print("Enter a letter (or a ! to guess the word):");
				counter ++;
				userGuess = read.nextLine();
			}
		}
		// If the word is guessed incompletely, win, the incomplete word and the number of guesses if printed
		if (!incomplete)
		{
			System.out.println("You win!");
			System.out.println("You guessed the word, it was: " + "'" + secretWords[randomWord] + "'");
			System.out.println("You took " + counter + " guesses to get it correct");
		} 
		else 
		{
			System.out.println("What is your guess?");
			guessWord = read.nextLine();
			counter ++;

			if(guessWord.equalsIgnoreCase(secretWords[randomWord]))
			{
				System.out.println("Congrats, you won!");
				System.out.println("You guessed the word, it was: " + "'" + secretWords[randomWord] + "'");
				System.out.println("You took " + counter + " guesses to get it correct");
			}
			else
			{
				System.out.println("You failed the task.");
				System.out.println("You did not guess the word, it was: " + "'" + secretWords[randomWord] + "'");
				System.out.println("You took " + counter + " guesses to get it correct");
			}
		}
	}
}	