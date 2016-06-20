import java.util.Scanner;

public class p307ex9DONE {

	public static void main(String[] args) {

		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt ();
		
		for (int i = 1; i <= t; i++)
		{
			long year = scan.nextLong();
			
				if ((year % 4 ) == 0 && (year % 100) != 0)
					System.out.println("1");
				else if ((year % 400) == 0)
					System.out.println("1");
				else 
					System.out.println("0");
			}
		}
	}

//Done