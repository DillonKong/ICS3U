package kong;

import java.util.Scanner;

public class GradesProgram {
	/* grades program
	 * Take any number of grades and give the corresponding letter grade with it.
	 * 22/3/16
	 * Dillon Kong
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("How many grades are you inputing?");
		int t = scan.nextInt();

		for (int i = 0; i <= t; i ++){

			System.out.println("Input a grade");
			int grade = scan.nextInt();

			if (grade <= 100 && grade >= 80)
				System.out.println(grade + "% is an A");

			else if (grade <= 79 && grade >= 70)
				System.out.println(grade + "% is a B");

			else if (grade <= 69 && grade >= 60)
				System.out.println(grade + "% is a C");

			else if (grade <= 59 && grade >= 50)
				System.out.println(grade + "% is a D");

			else if (grade <= 49 && grade >= 0)
				System.out.println(grade + "% is a F");

			else 
				System.out.println("X");
		}

	}

}


