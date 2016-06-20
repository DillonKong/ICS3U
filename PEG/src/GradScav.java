import java.util.Scanner;

public class GradScav {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt(), counter = 0;
		String [] names = new String [x];
		String [] team1 = new String [x];
		String [] team2 = new String [x];
		String [] team3 = new String [x];
		
		
		
		for (int i = 0; i < x ; i ++)
		{
			names[i] = scan.nextLine();
		}
		
		for (int y = 0; y < x / 3; y ++)
		{
			team1 [y] = names [counter];
			counter = counter + 3;
			System.out.println(team1[y]);
		}
		counter = 1;
		for (int t = 0; t < x / 3; t ++)
		{
			team2 [t] = names [counter];
			counter = counter + 3;
			System.out.println(team2[t]);
		}
		counter = 2;
		for (int r = 0; r < x / 3; r ++)
		{
			team3 [r] = names [counter];
			counter = counter + 3;
			System.out.println(team3[r]);
		}
		
		
		

	}

}
