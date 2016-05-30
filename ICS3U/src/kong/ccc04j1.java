package kong;

import java.util.Scanner;

public class ccc04j1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt(); 
		int x = (int) (Math.sqrt(number));
		System.out.println("The largest square has side length " + x + ".");
	}

}
