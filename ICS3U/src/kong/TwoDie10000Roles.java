package kong;

public class TwoDie10000Roles {

	public static void main(String[] args) {
		
		int [] total = {0,0,0,0,0,0,0,0,0,0,0};
		int sum = 0;
		for (int i = 0; i <= 10000; i ++)
		{
			int diceOne = (int) (Math.random () * 7 + 1), diceTwo = (int) (Math.random () * 7 + 1);
			sum = diceOne + diceTwo;

			if (sum == 2)
				total [0]++;
			else if (sum == 3)
				total [1]++;
			else if (sum == 4)
				total [2]++;
			else if (sum == 5)
				total [3]++;
			else if (sum == 6)
				total [4]++;
			else if (sum == 7)
				total [5]++;
			else if (sum == 8)
				total [6]++;
			else if (sum == 9)
				total [7]++;
			else if (sum == 10)
				total [8]++;
			else if (sum == 11)
				total [9]++;
			else if (sum == 12)
				total [10]++;
		}

		System.out.println("Total\tNumber of rolls");
		for (int i = 0; i < total.length; i ++)
		{
		System.out.println( (i+2)+ "\t" + total[i]);
		}
	}
}
