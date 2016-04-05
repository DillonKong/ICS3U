//Done
import java.util.Scanner;

public class ccc06j1 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner (System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();
		int four = scan.nextInt();
		int calorie = 0; 
		
		if (one == 1)
			calorie = calorie + 461;
		else if (one == 2)
			calorie = calorie + 431;
		else if (one == 3)
			calorie = calorie + 420;
		else 
			calorie = calorie + 0;
		
		if (two == 1)
			calorie = calorie + 100;
		else if (two == 2)
			calorie = calorie + 57;
		else if (two == 3)
			calorie = calorie + 70;
		else 
			calorie = calorie + 0;
		
		if (three == 1)
			calorie = calorie + 130;
		else if (three == 2)
			calorie = calorie + 160;
		else if (three == 3)
			calorie = calorie + 118;
		else 
			calorie = calorie + 0;
		
		if (four == 1)
			calorie = calorie + 167;
		else if (four == 2)
			calorie = calorie + 266;
		else if (four == 3)
			calorie = calorie + 75;
		else 
			calorie = calorie + 0;
		
		System.out.println("Your total Calorie count is " + calorie + ".");
	}

}
