package kong;

import java.util.Scanner;

public class NameList {

	public static void main(String[] args) {
		
		int number;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many names are you inputting?");
		number = Integer.parseInt(scan.nextLine());
		String [] names = new String [number];
		
		for (int i = 0; i < number; i ++)
			names [i] = scan.nextLine();
		
		for (int i = 0; i < number; i ++)
			System.out.println(names [i]);
		
		for (int i = number- 1; i >= 0; i --)
			System.out.println(names [i]);
		}
}
