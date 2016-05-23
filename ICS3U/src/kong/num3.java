package kong;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String 	line1 = scan.nextLine(), line2 = scan.nextLine(),line3 = scan.nextLine();
		int value = Integer.parseInt(scan.next());
		int height = Integer.parseInt(scan.next());
		int width = Integer.parseInt(scan.next());

		for (int i = 0; i < width * 2 + 5; i++ )
			System.out.print("=");

		System.out.println("");
		System.out.print("|" + value);

		for (int i = 0; i < width * 2 ; i++ )
			System.out.print(" ");
		System.out.print("|");

		int heightTwo = height;
		while (height > 1)
		{
			System.out.println("");
			System.out.print("|");

			for (int i = 0; i < width * 2  + 3; i++ )
				System.out.print(" ");
			System.out.print("|");
			height--;
		}
		
		System.out.println("");
		System.out.print("|");
		for (int i = 0; i < width; i++ )
			System.out.print(" ");

		System.out.print(line1);

		for (int i = 0; i < width ; i++ )
			System.out.print(" ");
		System.out.print("|");

		System.out.println("");
		System.out.print("|");
		for (int i = 0; i < width; i++ )
			System.out.print(" ");

		System.out.print(line2);

		for (int i = 0; i < width; i++ )
			System.out.print(" ");
		System.out.print("|");


		System.out.println("");
		System.out.print("|");
		for (int i = 0; i < width; i++ )
			System.out.print(" ");

		System.out.print(line3);

		for (int i = 0; i < width; i++ )
			System.out.print(" ");
		System.out.print("|");



		while (heightTwo > 1)
		{
			System.out.println("");
			System.out.print("|");

			for (int i = 0; i < width * 2  + 3; i++ )
				System.out.print(" ");
			System.out.print("|");
			heightTwo--;
		}
		System.out.println(" ");
		System.out.print("|");

		for (int i = 0; i < width * 2 ; i++ )
			System.out.print(" ");
		System.out.print(value + "|");
		
		System.out.println(" ");
		for (int i = 0; i < width * 2 + 5; i++ )
			System.out.print("=");
	}

}
/*
===============================
|100                          |
|             [|]             |
|             / \             |
|             \_/             |
|                          100|
===============================
100 1 13
 */
