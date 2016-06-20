import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import hsa_new.Console;

public class TechCulminatingOne { 

	public static Console input = new Console ( 20,100, 16, "Input");
	public static Console output = new Console (30,70, 16, "Output");
	public static int rndNum1 = 0, rndNum2 = 0, player1Total = 0, player2Total = 0;
	public static BufferedImage dice1, dice2, dice3, dice4, dice5, dice6;
	public static boolean winner = false, turn = true; // true = player1 & false = player2


	public static void main(String[] args) throws IOException{

			String choices [] = new String [10];
			dice1 = ImageIO.read(TechCulminatingOne.class.getResourceAsStream("dice1.png"));
			dice2 = ImageIO.read(TechCulminatingOne.class.getResourceAsStream("dice2.png"));
			dice3 = ImageIO.read(TechCulminatingOne.class.getResourceAsStream("dice3.jpg"));
			dice4 = ImageIO.read(TechCulminatingOne.class.getResourceAsStream("dice4.jpg"));
			dice5 = ImageIO.read(TechCulminatingOne.class.getResourceAsStream("dice5.png"));
			dice6 = ImageIO.read(TechCulminatingOne.class.getResourceAsStream("dice6.png"));

			output.println("PIG instructions \n 1. To win, a player must reach a score of 25 (One Dice) or 50 (Two Dice) \n 2.   ");
			input.println("Would you like to play one die or two dice? (One or Two)");
			choices [0] = input.readLine();

			if (choices [0].equalsIgnoreCase("one"))
			{
				input.clear();
				OneDPlayerOne();
			}
			else if (choices [0].equalsIgnoreCase("two"))
			{
				input.clear();
				TwoDPlayerOne();
			}
	}

	public static void OneDPlayerOne()
	{
		while (winner == false)
		{

			input.println("Press ENTER to roll dice.");
			input.getChar ();
			ScoreBoard();

			if (input.getKeyCode() == 10)
			{
				rndNum1 = (int) (Math.random() * 7) + 1;
				output.clear();
				input.clear();
			}
			if (rndNum1 == 1)
			{
				output.drawImage(dice1, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 2)
			{
				output.drawImage(dice2, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 3)
			{
				output.drawImage(dice3, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 4)
			{
				output.drawImage(dice4, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 5)
			{
				output.drawImage(dice5, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 6)
			{
				output.drawImage(dice6, 100, 100, 101, 101, null);
			}

			if (turn == true)
			{
				if (rndNum1 == 1)
					player1Total = 0;
				else
					player1Total = player1Total + rndNum1;
				output.println("Player 2's turn");
			}
			else if (turn == false)
			{
				if (rndNum1 == 1)
					player2Total = 0;
				else
					player2Total = player2Total + rndNum1;
				output.println("Player 1's turn");
			}
			turn = !turn;

			Winner();

		}
	}
	public static void TwoDPlayerOne()

	{
		while (winner == false)
		{

			input.println("Press enter to roll dice.");
			input.getChar ();
			if (input.getKeyCode() == 10)
			{
				rndNum1 = (int) (Math.random() * 7) + 1;
				rndNum2 = (int) (Math.random() * 7) + 1;
			}

			if (rndNum1 == 1)
			{
				output.drawImage(dice1, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 2)
			{
				output.drawImage(dice2, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 3)
			{
				output.drawImage(dice3, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 4)
			{
				output.drawImage(dice4, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 5)
			{
				output.drawImage(dice5, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 6)
			{
				output.drawImage(dice6, 100, 100, 101, 101, null);
			}

			if (rndNum2 == 1)
			{
				output.drawImage(dice1, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 2)
			{
				output.drawImage(dice2, 100, 200, 101, 101, null);
			}
			else if (rndNum2== 3)
			{
				output.drawImage(dice3, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 4)
			{
				output.drawImage(dice4, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 5)
			{
				output.drawImage(dice5, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 6)
			{
				output.drawImage(dice6, 100, 200, 101, 101, null);
			}


			if (turn == true)
			{
				if (rndNum1 == 1)
					player1Total = 0;
				else
					player1Total = player1Total + rndNum1;
				output.clear();
				input.clear();
				output.println("It's player 2's turn");
			}
			else if (turn == false)
			{
				if (rndNum1 == 1)
					player2Total = 0;
				else
					player2Total = player2Total + rndNum1;
				output.clear();
				input.clear();
				output.println("It's player 1's turn");
			}
			turn = !turn;

			Winner();
		}
	}

	public static void Winner()
	{// NEED SOUND AND IMAGES

			if (player1Total >= 25 && player2Total < 25)
			{
				output.clear();
				input.clear();
				//applause.start();
				output.println("PLAYER 1 WINS");
				input.println("PLAYER 1 WINS");
				winner = true;
			}
			else if (player2Total >= 25 && player1Total < 25)
			{
				output.clear();
				input.clear();
				//applause.start();
				output.println("PLAYER 2 WINS");
				input.println("PLAYER 2 WINS");
				winner = true;
			}		
	}
	public static void ScoreBoard() 
	{
		input.print("\t \t  ");
		for (int i = 0; i < 11; i ++)
		{
			input.print("-");
		}
		input.println("");
		input.println("\t \t |   SCORE   |");
		input.println("\t \t |           |");
		input.println("\t \t |P1  vs.  P2|");
		input.println("\t \t | " + player1Total +" vs. " + player2Total + " |");
		input.println("\t \t |           |");
		input.print("\t \t  ");
		for (int i = 0; i < 11; i ++)
		{
			input.print("-");
		}
	}
}