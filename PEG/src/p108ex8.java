import java.util.Scanner;

public class p108ex8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt(); 

		for (int i = 0; i <= t; i ++)
		{
			int degree = scan.nextInt();
			{
				if (degree <= 135 && degree >= 45)
					System.out.println("N");
				else if (degree > 135 && degree < 225)
					System.out.println("W");
				else if (degree >= 225 && degree <= 315)
					System.out.println("S");
				else
					System.out.println("E");

			}
		}

	}

}
