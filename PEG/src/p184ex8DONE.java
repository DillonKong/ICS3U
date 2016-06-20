import java.util.Scanner;

public class p184ex8DONE {
//Voting
	//DONE
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String [] votes = new String [t];
		int [] candidates = new int [7];
		
		for (int i = 0; i < t; i ++)
		{
			votes [i] =  scan.nextLine();
		}
		for (int x = 0; x < t; x++)
		{
			if (votes [x].equals("A"))
				candidates [0] ++;
			else if (votes [x].equals("B"))
				candidates [1] ++;
			else if (votes [x].equals("C"))
				candidates [2] ++;
			else if (votes [x].equals("D"))
				candidates [3] ++;
			else if (votes [x].equals("E"))
				candidates [4] ++;
			else if (votes [x].equals("F"))
				candidates [5] ++;
			else 
				candidates [6] ++;
				
		}
			System.out.println(candidates[0]);
			System.out.println(candidates[1]);
			System.out.println(candidates[2]);
			System.out.println(candidates[3]);
			System.out.println(candidates[4]);
			System.out.println(candidates[5]);
			System.out.println(candidates[6]);
		
		

	}

}
