import java.util.Scanner;

public class P118EX4DONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();

		for (int i = 1; i <= t; i ++)
		{
			System.out.println(t + " X " + i + " = " + (t * i));
		}
	}

}
