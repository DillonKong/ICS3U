package kong;

import java.util.Scanner;

public class WordGuess1 {

	public static void main(String[] args) {

		String[] secretWords = new String[]{"Brain" , "Tree" , "Happy" , "Computer" , "Phone"};
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int randomWord = (int) (Math.random() * 5);
		boolean dashes = true;
		String userGuess = "#";
		String guessWord;
		char[] wordDashes = new char[secretWords[randomWord].length()];
		System.out.println("Word Guessing Game...");

		for (int i = 0; i < secretWords[randomWord].length(); i++) 
			wordDashes[i] = '-';


		char[] wordOfsecretWords = secretWords[randomWord].toCharArray();


		while (!userGuess.equalsIgnoreCase("!") && dashes) 
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
					dashes = true;
					break;
				}
				if (wordDashes[i] != '-') 
					dashes = false;
			}
			System.out.println();
			if(dashes){
				System.out.print("Enter a letter (or a ! to guess the word):");

				userGuess = read.nextLine();
			}
		}

		if (!dashes) {
			System.out.println("You win!");
			System.out.println("You guessed the word, it was: " + "'" + secretWords[randomWord] + "'");
		} 

		else 
		{
			System.out.println("What is your guess?");
			guessWord = read.nextLine();

			if(guessWord.equalsIgnoreCase(secretWords[randomWord]))
			{
				System.out.println("Congrats, you won!");
				System.out.println("You guessed the word, it was: " + "'" + secretWords[randomWord] + "'");
			}
			else
			{
				System.out.println("You failed the task.");
				System.out.println("You did not guess the word, it was: " + "'" + secretWords[randomWord] + "'");
			}
		}
	}
}	