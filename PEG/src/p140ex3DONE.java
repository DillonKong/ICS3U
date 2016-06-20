import java.util.Scanner;

public class p140ex3DONE {
//COLUMN of numbers
	//DONE
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String number = null;
		number = scan.nextLine();
		
		for (int i = number.length(); i > 0; i --)
		{
			System.out.println(number.charAt(i-1));
		}

	}

}

