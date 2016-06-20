import java.text.DecimalFormat;
import java.util.Scanner;
//INTEREST
//DONE
public class P124EX3DONE {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		double money = scan.nextDouble();
		double interest = scan.nextDouble();
		double x = (interest / 100) + 1;
		double years = scan.nextDouble();
		
		DecimalFormat df =  new DecimalFormat ("0.00");
		
		System.out.println("0 " + df.format(money));
		
		for (int i = 1; i < years + 1; i ++)
		{
			money = money * x;
			System.out.println(i + " " + df.format (money));
		}

	}
	
}
