import java.util.Scanner;

public class ThreeNPlusOneDONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int counter = 0;

		while (n != 1)
		{
			if ((n % 2) == 0)
			{
				n = n / 2;
				counter ++;
			}
			else if ((n % 2 ) == 1)
			{
				n = (n * 3) + 1;
				counter ++;
			}
		}
		System.out.println(counter);
	}
}

//Done



