package kong;

import java.util.Scanner;

public class NameGame {
	/* Name game
	 * Take name from user, 70% say "I like the name", the other 30% say "I hate it"
	 * 23/3/16
	 * Dillon Kong
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your name?");
		String name =  scan.nextLine();

		int percentage = (int) (Math.random() * 10);

		if (percentage <= 2)
			System.out.println("Sorry, " +  name + ", I hate your name.");
		else 
			System.out.println(name + ", I love your name.");
	}

}
