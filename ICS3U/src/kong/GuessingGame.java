package kong;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String answer = null;
		boolean win = false;
		String [] animals = {"Dog", "Cat", "Lion", "Bison", "Dolphin", "Eagle", "Bird", "Pony", "Monkey", "Ape", "Fish", "Whale", "Lobster", "Cow", "Bull", "Deer", "Duck", "Goose", "Rabbit", "Wolf", "Turkey", "Pig", "Boar", "Ostrich", "Poodle", "Snake", "Shark", "Kangaroo", "Bear", "Chicken", "Horse", "Tiger"};
		//32
		System.out.println("Hi, let's play a guessing game. Think of an animal and press a key when you are ready");
		int counter = 0;

		while (counter < animals.length)
		{
			System.out.println("Is it a " + animals[counter] + "?");
			counter ++;
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("yes"))
			{
				win = true;
			}
			else if (answer.equalsIgnoreCase("no"))
				win = false;
		}

		if (win == true)
			System.out.println("I win");
		else
			System.out.println("I give up, you win");
	}
}
