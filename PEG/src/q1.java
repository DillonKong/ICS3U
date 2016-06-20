import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class q1 {
//MEDIAN
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.#");
		int t = scan.nextInt(), evenUp = 0, evenDown = 0, x = 0;
		double	mean = 0; 
		double [] numbers = new double [t];
		
		for (int i = 0; i < t; i ++)
		{
			numbers[i] = scan.nextInt();
		}
		
		Arrays.sort(numbers);
		
		if ((t % 2) == 0)
		{
			evenUp = (t / 2) + 1; 
			evenDown = (t / 2);
			mean = (numbers [evenUp - 1] + numbers [evenDown - 1]) / 2;
			System.out.println("The median on the test is " + df.format(mean));
			
		}
		else 
		{
			x = (t / 2) ;
			mean = numbers [x];
			System.out.println("The median on the test is " + df.format(mean));
		}
	}

}
