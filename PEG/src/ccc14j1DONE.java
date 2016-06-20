import java.util.Scanner;

public class ccc14j1DONE {

	public static void main(String[] args) {
		//Triangle Times
		// DONE

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int [] angles = new int [3];
		angles [0] = scan.nextInt();
		angles [1] = scan.nextInt();
		angles [2] = scan.nextInt();

		if (angles [0] == angles [1] && angles [1] == angles [2])
		{
			System.out.println("Equilateral");
		}

		else if ((angles [0] + angles [1] + angles [2]) == 180) 
		{
			if ((angles[0] == angles[1]) || (angles[0] == angles[2]) || (angles[1] == angles[2]))
			{
				System.out.println("Isosceles");
			}
			else if ((angles[0] != angles[1]) && (angles[0] != angles[2]) && (angles[1] != angles[2]))
			{
				System.out.println("Scalene");
			}
		}
		else 
			System.out.println("Error");
	}
}
