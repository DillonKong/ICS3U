import java.util.Scanner;

public class p299ex3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String [] letters = new String [t];
		
		for (int i = 0; i < t + 1; i ++)
			letters [i] = scan.nextLine();
		
		for (int x = 0; x < t + 1; x++){
			System.out.println(letters [x].toLowerCase());
		}
	}
}
