import java.util.Arrays;
import java.util.Scanner;

public class ccc07j1DONE {
// Who's in the middle
	// Done
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int [] numbers = new int [3];
		
		for (int i = 0; i < 3; i ++)
		{
			numbers [i] = scan.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println(numbers[1]);

	}

}
