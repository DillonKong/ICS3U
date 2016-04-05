import java.util.Scanner;

public class p307ex7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();

		for (int i = 0; i <= t; i ++){
			int grade = scan.nextInt();

			if (grade <= 100 && grade >= 80)
				System.out.println("A");

			else if (grade <= 79 && grade >= 70)
				System.out.println("B");

			else if (grade <= 69 && grade >= 60)
				System.out.println("C");

			else if (grade <= 59 && grade >= 50)
				System.out.println("D");

			else if (grade <= 49 && grade >= 0)
				System.out.println("F");
				
			else 
				System.out.println("X");
		}

	}
}
//Done

