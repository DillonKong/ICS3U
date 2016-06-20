import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class TestMouseCode {

	public static Console screen = new Console (45,235);
	public static int rndNum1 = 0, rndNum2 = 0, player1Total = 0, player2Total = 0,x = 0, y = 0;
	public static BufferedImage dice1, dice2, dice3, dice4, dice5, dice6,oneDice,twoDice;
	public static boolean winner = false, turn = true; // true = player1 & false = player2


	public static void main(String[] args) throws IOException{
		twoDice = ImageIO.read(TestMouseCode.class.getResourceAsStream("2 Dice.png"));
		dice1 = ImageIO.read(TestMouseCode.class.getResourceAsStream("dice1.png"));
		dice2 = ImageIO.read(TestMouseCode.class.getResourceAsStream("dice2.png"));
		dice3 = ImageIO.read(TestMouseCode.class.getResourceAsStream("dice3.jpg"));
		dice4 = ImageIO.read(TestMouseCode.class.getResourceAsStream("dice4.jpg"));
		dice5 = ImageIO.read(TestMouseCode.class.getResourceAsStream("dice5.png"));
		dice6 = ImageIO.read(TestMouseCode.class.getResourceAsStream("dice6.png"));

		screen.println("Pig");
		screen.println("\nPick one to start.");
		screen.drawImage(oneDice,100,100,100,150,null);
		screen.drawImage(twoDice, 300, 100, 100,150, null);
		

		screen.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent me) {
				x = me.getX();
				y = me.getY();
				screen.println(x + ", " + y);
			} 
		});

		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Sleep Interrupted");
			}

			if (x > 118 && x < 209)
			{
				if (y > 207 && y < 304)
				{
					screen.clear();
					OneDice();
				}
			}
			else if (x > 316 && x < 408)
			{
				if (y > 207 && y < 303)
				{
					screen.clear();
					TwoDice();
				}
			}
		}
	}
	public static void OneDice()

	{
		while (winner == false)
		{

			screen.println("Press ENTER to roll dice.");
			screen.getChar ();

			if (screen.getKeyCode() == 10)
			{
				rndNum1 = (int) (Math.random() * 7) + 1;
				screen.clear();
			}

			if (rndNum1 == 1)
			{
				screen.drawImage(dice1, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 2)
			{
				screen.drawImage(dice2, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 3)
			{
				screen.drawImage(dice3, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 4)
			{
				screen.drawImage(dice4, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 5)
			{
				screen.drawImage(dice5, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 6)
			{
				screen.drawImage(dice6, 100, 100, 101, 101, null);
			}

			if (turn == true)
			{
				if (rndNum1 == 1)
					player1Total = 0;
				else
					player1Total = player1Total + rndNum1;
				screen.println("Player 2's turn");
			}
			else if (turn == false)
			{
				if (rndNum1 == 1)
					player2Total = 0;
				else
					player2Total = player2Total + rndNum1;
				screen.println("Player 1's turn");
			}
			turn = !turn;

		}
	}
	public static void TwoDice()
	{
		while (winner == false)
		{

			screen.println("Press enter to roll dice.");
			screen.getChar ();
			if (screen.getKeyCode() == 10)
			{
				rndNum1 = (int) (Math.random() * 7) + 1;
				rndNum2 = (int) (Math.random() * 7) + 1;
			}

			if (rndNum1 == 1)
			{
				screen.drawImage(dice1, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 2)
			{
				screen.drawImage(dice2, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 3)
			{
				screen.drawImage(dice3, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 4)
			{
				screen.drawImage(dice4, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 5)
			{
				screen.drawImage(dice5, 100, 100, 101, 101, null);
			}
			else if (rndNum1 == 6)
			{
				screen.drawImage(dice6, 100, 100, 101, 101, null);
			}

			if (rndNum2 == 1)
			{
				screen.drawImage(dice1, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 2)
			{
				screen.drawImage(dice2, 100, 200, 101, 101, null);
			}
			else if (rndNum2== 3)
			{
				screen.drawImage(dice3, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 4)
			{
				screen.drawImage(dice4, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 5)
			{
				screen.drawImage(dice5, 100, 200, 101, 101, null);
			}
			else if (rndNum2 == 6)
			{
				screen.drawImage(dice6, 100, 200, 101, 101, null);
			}


			if (turn == true)
			{
				if (rndNum1 == 1)
					player1Total = 0;
				else
					player1Total = player1Total + rndNum1;
				screen.clear();
				screen.clear();
				screen.println("It's player 2's turn");
			}
			else if (turn == false)
			{
				if (rndNum1 == 1)
					player2Total = 0;
				else
					player2Total = player2Total + rndNum1;
				screen.clear();
				screen.clear();
				screen.println("It's player 1's turn");
			}
			turn = !turn;

			Winner();
		}
	}
	public static void Winner()

	{// NEED SOUND AND IMAGES

		if (player1Total >= 25 && player2Total < 25)
		{
			screen.clear();
			screen.clear();
			//applause.start();
			screen.println("PLAYER 1 WINS");
			screen.println("PLAYER 1 WINS");
			winner = true;
		}
		else if (player2Total >= 25 && player1Total < 25)
		{
			screen.clear();
			screen.clear();
			//applause.start();
			screen.println("PLAYER 2 WINS");
			screen.println("PLAYER 2 WINS");
			winner = true;
		}		
	}
}