import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class p171ex6aDONE {
// Sort max
	//DONE
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		double [] numbers = new double [t];

		for (int i = 0; i < t; i ++)
		{
			numbers [i] = scan.nextDouble();
		}
		Arrays.sort(numbers);
		 DecimalFormat twoDForm = new DecimalFormat("#.####");
		String answer = twoDForm.format(numbers [t - 1]); 
		System.out.println(answer);

		

	}

}
