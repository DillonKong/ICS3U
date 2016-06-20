import java.util.Scanner;

public class q4 {
	// Connect 4
	public static void main(String [] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();

		String   board0 = null, board1 = null, board2 = null, board3 = null;
		String  [] answer = new String [t];
		char x = 'X';

		for (int i = 0; i < t; i ++)
		{
			board0 = scan.nextLine();
			board1 = scan.nextLine();
			board2 = scan.nextLine();
			board3 = scan.nextLine();
			
			//Horizontal
			if ( (board0.charAt(0)) == (board0.charAt(1)) && (board0.charAt(0)) == (board0.charAt(2)) && (board0.charAt(0)) == (board0.charAt(3)) && (board0) == "XXXX")
				answer [i] = "Yes";
			else if ( (board1.charAt(0)) == (board1.charAt(1)) && (board1.charAt(1)) == (board1.charAt(2)) && (board1.charAt(0)) == (board1.charAt(3)) && (board1) == "XXXX")
				answer [i] = "Yes";
			else if ( (board2.charAt(0)) == (board2.charAt(1)) && (board2.charAt(1)) == (board2.charAt(2)) && (board2.charAt(0)) == (board2.charAt(3)) && (board2) == "XXXX")
				answer [i] = "Yes";
			else if ((board0.charAt(0)) == (board3.charAt(0)) && (board3.charAt(1)) == (board2.charAt(2)) && (board3.charAt(0)) == (board3.charAt(3)) && (board3) == "XXXX")
				answer [i] = "Yes";
			//Vertical
			else if ((board0.charAt(0)) == (board1.charAt(0)) && (board0.charAt(0)) == (board2.charAt(0)) && (board0.charAt(0)) == (board3.charAt(0)) && (board0.charAt(0)) == x)
				answer [i] = "Yes";
			else if ((board0.charAt(1)) == (board1.charAt(1)) && (board0.charAt(1)) == (board2.charAt(1)) && (board0.charAt(1)) == (board3.charAt(1)) && (board0.charAt(1)) == x)
				answer [i] = "Yes";
			else if ((board0.charAt(2)) == (board1.charAt(2)) && (board0.charAt(2)) == (board2.charAt(2)) && (board0.charAt(2)) == (board3.charAt(2)) && (board0.charAt(2)) == x)
				answer [i] = "Yes";
			else if ((board0.charAt(3)) == (board1.charAt(3)) && (board0.charAt(3)) == (board2.charAt(3)) && (board0.charAt(3)) == (board3.charAt(3)) && (board0.charAt(3)) == x)
				answer [i] = "Yes";

			else if ((board0.charAt(0)) == (board1.charAt(1)) && (board0.charAt(0)) == (board2.charAt(2)) && (board0.charAt(0)) == (board3.charAt(3)) && (board0.charAt(0)) == x)
				answer [i] = "Yes";
			else if ((board0.charAt(3)) == (board1.charAt(2)) && (board0.charAt(3)) == (board2.charAt(2)) && (board0.charAt(0)) == (board3.charAt(1)) && (board0.charAt(0)) == x)
				answer [i] = "Yes";
			else  
				answer [i] = "No";
		}
		for (int e = 0; e < t; e ++)
		{
			System.out.println(answer [e]);
		}
	}
}