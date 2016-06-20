import java.util.Scanner;

public class ccc03j2DONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int  pictures = 0, x = 0, y = 0, p = 0;
		boolean zero = false;

		while (zero == false)
		{
			pictures = scan.nextInt();

			if (pictures != 0)
			{
				x = (int) (Math.sqrt(pictures));
				y = pictures / x;
				p = (y+y)+(x+x);
				System.out.println("Minimum perimeter is " + p +" with dimensions "+ x + " x " + y);
				zero = false;
			}
			else 
				zero = true;
		}
		System.out.println("");

	}

}
