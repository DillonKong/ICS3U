import java.util.Scanner;

public class ccc12j1 {
	//Speed Limit
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int limit = 0, recorded = 0, difference = 0;
		limit = scan.nextInt();
		recorded = scan.nextInt();
		if (limit > recorded)
			System.out.println("Congratulations, you are within the speed limit!");
		else if (limit <= recorded)
		{
			difference = recorded - limit;
			System.out.println(difference);
			if (difference >= 1 && difference <=20)
				System.out.println("You are speeding and your fine is $100.");
			else if (difference >= 21 && difference <= 30)
				System.out.println("You are speeding and your fine is $270.");
			else if (difference >= 31)
				System.out.println("You are speeding and your fine is $500.");
		}
	}
}
