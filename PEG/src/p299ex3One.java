import java.util.Scanner;

public class p299ex3One {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		String [] letters = new String [x];
		
		for (int i = 0; i <= x; i ++)
			letters [i] = scan.nextLine();
		
		for (int i = 0; i <= x; i++){
			letters[1].toUpperCase();
			System.out.println(letters [i]);
		}
	}

}
