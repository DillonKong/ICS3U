import java.util.Scanner;

public class p79ex5DONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		
		if ((one % two) == 0)
			System.out.println("yes");
		else 
			System.out.println("no");
	}

}
