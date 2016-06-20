import java.util.Scanner;

public class acmtryouts1aDONE {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i <= n; i ++)
		{
			String choice = scan.nextLine();

			if (choice.equals("Foxen"))
				i = n;
			else
			{
				if (choice.equals("Rock"))
					System.out.println("Paper");

				else if (choice .equals("Paper"))
					System.out.println("Scissors");

				else if (choice.equals("Scissors"))
					System.out.println("Rock");

				else if (choice.equals("Fox"))
					System.out.println("Foxen");

			}
		}

	}
}
//Done
