package kong;

import java.util.Scanner;

public class MothersAge {
	/*MothersAge
	 * Inputs mother's, child's and both their ages. Then out put the mothers age when she gave birth
	 * 8/3/16
	 * Dillon Kong
	 */
	public static void main(String[] args) {
		//Set up scanner for user input
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		//Line of questions for user and puts into variables
		System.out.println("Whats's is the mothers name?");
		String mothersName = scan.nextLine();
		System.out.println("What's the mothers year of birth?");
		int mothersAge =  Integer.parseInt(scan.nextLine());
		System.out.println("Whats's is the childs name?");
		String childsName =  scan.nextLine();
		System.out.println("What's the childs year of birth?");
		int childsAge =  Integer.parseInt(scan.nextLine());
		//If statement for if the mothers age is inputed as smaller than the child
		if (mothersAge < childsAge)
		{
			System.out.println("That's not possible");
		}
		else 
		{
			//Calculates and outputs the mothers age
			int motherAgeAtBirth = mothersAge-childsAge;
			System.out.println(mothersName + " was " + motherAgeAtBirth + " when " + childsName + " was born.");
		}
	}

}
