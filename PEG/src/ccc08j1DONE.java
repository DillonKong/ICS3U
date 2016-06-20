import java.util.Scanner;
// Body Mass Index
// Done
public class ccc08j1DONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		double weight = scan.nextDouble();
		double height = scan.nextDouble();
		double bmi = (weight / (height * height));

		if (bmi > 25)
			System.out.println("Overweight");
		else if (bmi <= 25 && bmi >= 18.5)
			System.out.println("Normal weight");
		else if (bmi < 18.5)
			System.out.println("Underweight");
	}

}
