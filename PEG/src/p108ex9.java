import java.text.DecimalFormat;
import java.util.Scanner;

public class p108ex9 {
	//PAY
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int t = scan.nextInt();
		double wage = 0, hours = 0.00, taxT = 0.00, donateT = 0.00;
		String tax = null, donate = null; 
		double [] total = new double [t];

		for (int i = 0; i < t; i ++)
		{
			wage = scan.nextDouble();
			hours = scan.nextDouble();
			tax = scan.nextLine();
			donate = scan.nextLine();

			if (tax.equalsIgnoreCase("A"))
				taxT = 1.00;
			else if (tax.equalsIgnoreCase("B"))
				taxT = 0.90;
			else if (tax.equalsIgnoreCase("C"))
				taxT = 0.80;
			else if (tax.equalsIgnoreCase("D"))
				taxT = 0.71;
			else if (tax.equalsIgnoreCase("E"))
				taxT = 0.65;

			if (donate.equalsIgnoreCase("y"))
				donateT = 10;
			else
				donateT = 0;

			total [i] = (wage * hours * taxT) + donateT;
		}
		for (int x = 0; x < t; x ++)
		{

			System.out.println (df.format(total [x]));
		}



	}

}
