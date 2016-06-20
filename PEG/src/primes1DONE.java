import java.util.Scanner;

public class primes1DONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		int t = scan.nextInt();

		for (int i = 0; i < t; i ++)

			System.out.println(primes[i]);

	}
}
