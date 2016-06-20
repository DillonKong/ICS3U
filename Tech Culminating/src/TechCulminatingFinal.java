import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import hsa_new.Console;

public class TechCulminatingFinal {
/*Dillon Kong
 * Game: PIG
 */
	public static Console screen = new Console (45,235);
	public static int rndNum1 = 0, rndNum2 = 0, player1Score = 0, player2Score = 0, x = 0, y = 0, dividerCounter = 150, diceNumber = 0;
	public static BufferedImage dice1, dice2, dice3, dice4, dice5, dice6,oneDice,twoDice, scoreBoard, fireworks, BlueBackground, GreenBackground, RedBackground,dice1Solid;
	public static boolean winner = false,ready = true, playAgain = true, turn = true; // true = player1 & false = player2

	public static void main(String[] args) throws IOException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {

		//Imports images
		oneDice = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("1 Dice.png"));
		twoDice = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("2 Dice.png"));
		dice1 = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("diceOne.png"));
		dice1Solid = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("dice1.png"));
		dice2 = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("dice2.png"));
		dice3 = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("dice3.jpg"));
		dice4 = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("dice4.jpg"));
		dice5 = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("dice5.png"));
		dice6 = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("dice6.png"));
		scoreBoard = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("scoreboard.png"));
		fireworks = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("fireworks-landscape.jpg"));
		BlueBackground = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("BlueBackground.png"));
		GreenBackground = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("GreenBackground.png"));
		RedBackground = ImageIO.read(TechCulminatingFinal.class.getResourceAsStream("RedBackground.png"));

		//Sets up mouse clicking listener
		screen.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				x = me.getX(); 	
				y = me.getY();
			} 
		});
		
		while (playAgain == true)// Only runs while their is no winner	
		{
			screen.drawImage(BlueBackground, 0, 0, 10000, 100000, null);	
			screen.setColour(Color.WHITE);
			screen.setFont(new Font("Algerian", Font.BOLD, 75));
			screen.drawString("PIG",880,110);
			screen.setFont(new Font("Arial", Font.BOLD, 20));
			screen.drawString("Pick one to start.",875, 150);
			screen.setFont(new Font("Algerian", Font.BOLD, 75));

			screen.drawString("_______", 580, 180);
			screen.drawString("|1 dice|", 560, 250);
			screen.drawString("_______", 580, 260);

			screen.drawString("_______", 1020, 180);
			screen.drawString("|2 dice|", 1000, 250);
			screen.drawString("_______", 1020, 260);

			screen.setFont(new Font("Arial", Font.BOLD, 45));

			screen.setColour(Color.BLACK);
			screen.drawString("OR", 910, 300);
			screen.setFont(new Font("Algerian", Font.BOLD, 75));
			screen.setColour(Color.WHITE);
			screen.drawString("______________", 650, 350);
			screen.drawString("|Instructions|", 630, 420);
			screen.drawString("______________", 650, 430);

			while(true){// Checks screen for if the user has clicked one of the preset buttons
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.err.println("Sleep Interrupted");
				}
				if ((x > 595 && x < 888) && (y > 271 && y < 350))
				{
					screen.clear();
					diceNumber = 1;
					OneDice();

				}
				else if ((x > 1034 && x < 1327) && (y > 275 && y < 346))
				{
					screen.clear();
					diceNumber = 2;
					TwoDice();
				}
				else if ((x > 665 && x < 1250) && (y > 439 && y < 521))
				{
					screen.clear();
					Instructions();
				}
			}
		}
	}
	public static void OneDice() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{
		while (winner == false)//Checks for a winner
		{
			screen.clear();
			screen.drawImage(RedBackground, 0, 0, 100000,100000, null);
			screen.drawImage(scoreBoard,1150,100,650,350,null);

			screen.setFont(new Font("Comic Sans MS", Font.BOLD, 100));
			screen.drawString (Integer.toString(player1Score),1240,345);	
			screen.drawString(Integer.toString(player2Score), 1585, 345);
			screen.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
			screen.setTextColor(Color.RED);
			screen.drawString("ONE DICE", 1330, 190);
			screen.setTextColor(Color.BLACK);
			if (ready == true)
			{
				rndNum1 = 0;
				if (turn == true)//Player 1 turn
				{
					screen.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
					screen.drawString("Player 1 press 'ENTER' to roll die" ,500, 100);
					screen.drawString("or 'SPACE' to end turn" ,500, 150);
				}
				else if (turn == false)//Player 2 turn
				{
					screen.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
					screen.drawString("Player 2 press 'ENTER' to roll die" ,500, 100);
					screen.drawString("or 'SPACE' to end turn" ,500, 150);
				}
				screen.getChar ();


				if (screen.getKeyCode() == 10)// If the user clicks enter 
				{
					rndNum1 = (int) (Math.random() * 6) + 1;
					// Prints the dice corresponding to the random number
					if (rndNum1 == 1)
					{
						screen.drawImage(dice1, 150,500, 300,300, null);
						whosTurn();
					}
					else if (rndNum1 == 2)
					{
						screen.drawImage(dice2, 150, 500, 300, 300, null);
						whosTurn();
					}
					else if (rndNum1 == 3)
					{
						screen.drawImage(dice3, 150, 500, 300, 300, null);
						whosTurn();
					}
					else if (rndNum1 == 4)
					{
						screen.drawImage(dice4, 150, 500, 300, 300, null);
						whosTurn();
					}
					else if (rndNum1 == 5)
					{
						screen.drawImage(dice5, 150, 500, 300, 300, null);
						whosTurn();
					}
					else if (rndNum1 == 6)
					{
						screen.drawImage(dice6, 150, 500, 300, 300, null);
						whosTurn();
					}
				}
				else if (screen.getKeyCode() == 32)// If the user clicks 'Space'
				{//Changes to players turn
					turn = !turn;
					rndNum1 = 0;
				}

				//Adds score to running total
				if (turn == true)//player 1
				{
					if (rndNum1 == 1)
						player1Score = 0;
					else
						player1Score = player1Score + rndNum1;
				}
				else if (turn == false)//player 2
				{
					if (rndNum1 == 1)
						player2Score = 0;
					else
						player2Score = player2Score + rndNum1;
				}
			}
			ready = false;// line is used so that the user can't hold in the enter button and have the same number output.
			CheckWinner();
			Thread.sleep(750);
			ready = true;
		}

		if (winner == true)//Play the game again
		{
			screen.clear();
			screen.setFont(new Font("Algerian", Font.BOLD, 75));
			screen.setColour(Color.BLACK);
			screen.drawString("Do you want to play again?", 300, 300);
			screen.drawString("YES", 700, 425);
			screen.drawString("NO", 975, 425);
			if ((x > 711 && x < 864) && (y > 450 && y < 505))
			{
				Reset();
				main(null);
			}
			else if ((x > 992 && x < 1093) && (y > 452 && y < 505))
			{
				screen.close();
			}
		}
	}
	public static void TwoDice() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException{

		while (winner == false)
		{
			screen.clear();
			screen.drawImage(GreenBackground, 0, 0, 100000,100000, null);
			screen.drawImage(scoreBoard,1150,100,650,350,null);

			screen.setFont(new Font("Comic Sans MS", Font.BOLD, 100));
			screen.drawString (Integer.toString(player1Score),1240,345);
			screen.drawString(Integer.toString(player2Score), 1585, 345);
			screen.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
			screen.setTextColor(Color.RED);
			screen.drawString("TWO DICE", 1330, 190);
			screen.setTextColor(Color.BLACK);
			if (ready = true)
			{
				rndNum1 = 0;
				rndNum2 = 0;
				if (turn == true)//Player 1 turn
				{
					screen.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
					screen.drawString("PLAYER 1: Press 'ENTER' to roll dice" ,500, 100);
					screen.drawString("or 'SPACE' to end turn" ,500, 150);
				}
				else if (turn == false)//Player 1 turn
				{
					screen.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
					screen.drawString("PLAYER 2: Press 'ENTER' to roll dice" ,500, 100);
					screen.drawString("or 'SPACE' to end turn" ,500, 150);
				}
				screen.getChar ();

				if (screen.getKeyCode() == 10)// Continue turn
				{

					rndNum1 = (int) (Math.random() * 6) + 1;
					rndNum2 = (int) (Math.random() * 6) + 1;


					screen.setFont(new Font("Comic Sans MS", Font.BOLD, 55));

					if (rndNum1 == 1)
					{
						screen.drawImage(dice1Solid, 150, 500, 300, 300, null);
						secondDicePrint();
						Thread.sleep(1000);

					}
					else if (rndNum1 == 2){
						screen.drawImage(dice2, 150, 500, 300, 300, null);
						secondDicePrint();
						whosTurn();
					}
					else if (rndNum1 == 3){
						screen.drawImage(dice3, 150, 500, 300, 300, null);
						secondDicePrint();
						whosTurn();
					}
					else if (rndNum1 == 4){
						screen.drawImage(dice4, 150, 500, 300, 300, null);
						secondDicePrint();
						whosTurn();
					}
					else if (rndNum1 == 5){
						screen.drawImage(dice5, 150, 500, 300, 300, null);
						secondDicePrint();
						whosTurn();
					}
					else if (rndNum1 == 6){
						screen.drawImage(dice6, 150, 500, 300, 300, null);
						secondDicePrint();
						whosTurn();
					}
				}
				else if (screen.getKeyCode() == 32) // End turn
				{
					turn = !turn;
					rndNum1 = 0;
					rndNum2 = 0;
				}
				if (turn == true)// Player 1 turn
				{
					if (rndNum1 == rndNum2)
						player1Score = 0;
					else
						player1Score = player1Score + rndNum1 + rndNum2;
				}
				else if (turn == false)//Player 2 turn
				{
					if (rndNum1 == rndNum2)
						player2Score = 0;
					else
						player2Score = player2Score + rndNum1 + rndNum2;
				}
			}
			ready = false;
			CheckWinner();
			Thread.sleep(1000);
			ready = true;
		}
		if (winner == true)//Play again
		{
			screen.clear();
			screen.setFont(new Font("Algerian", Font.BOLD, 75));
			screen.setColour(Color.BLACK);
			screen.drawString("Do you want to play again?", 300, 300);
			screen.drawString("YES", 700, 425);
			screen.drawString("NO", 975, 425);

			if ((x > 711 && x < 864) && (y > 450 && y < 505))
			{
				Reset();
				main(null);
			}
			else if ((x > 992 && x < 1093) && (y > 452 && y < 505))
			{
				screen.close();
			}
		}
	}
	public static void secondDicePrint ()
	{//used for 2 dice two
		// Print the second set of dice
		if (rndNum2 == 1){
			screen.drawImage(dice1Solid, 501, 500, 300, 300, null);
			whosTurn();
		}
		else if (rndNum2 == 2){
			screen.drawImage(dice2, 501, 500, 300, 300, null);
			whosTurn();
		}
		else if (rndNum2== 3){
			screen.drawImage(dice3, 501, 500, 300, 300, null);
			whosTurn();
		}
		else if (rndNum2 == 4){
			screen.drawImage(dice4, 501, 500, 300, 300, null);
			whosTurn();
		}
		else if (rndNum2 == 5){
			screen.drawImage(dice5, 501, 500, 300, 300, null);
			whosTurn();
		}
		else if (rndNum2 == 6){
			screen.drawImage(dice6, 501, 500, 300, 300, null);
			whosTurn();
		}
	}
	public static void Reset()
	{//Resets all variables
		rndNum1 = 0; 
		rndNum2 = 0;
		player1Score = 0;
		player2Score = 0;
		x = 0;
		y = 0;
		dividerCounter = 150;
		diceNumber = 0;
		winner = false;
		ready = true;
		playAgain = true;
		turn = true;

	}
	public static void whosTurn ()
	{//To show who's dice was rolled by whom
		if (turn == true)
		{
			screen.setFont(new Font("Algerian", Font.BOLD, 75));
			screen.setColour(Color.BLACK);
			screen.drawString("Player 1 rolled a:", 150, 450);
		}
		else if (turn == false)
		{
			{
				screen.setFont(new Font("Algerian", Font.BOLD, 75));
				screen.setColour(Color.BLACK);
				screen.drawString("Player 2 rolled a:", 150, 450);
			}
		}
	}
	public static void CheckWinner() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{//Checks for is there's a winner.
		try{
			if (diceNumber == 1)
			{
				if (player1Score >= 50 && player2Score < 50)// If player 1 has a score greater or equal to 50 but player 2 is less than 50
				{
					screen.clear();
					screen.drawImage(fireworks, 10, 10, 2250 , 1000, null);
					screen.setFont(new Font("Algerian", Font.BOLD, 75));
					screen.setColour(Color.WHITE);
					screen.drawString("PLAYER 1 WINS", 1250,200);
					Thread.sleep(5000);
					winner = true;
				}
				else if (player2Score >= 50 && player1Score < 50)// If player 2 has a score greater or equal to 50 but player 1 is less than 50
				{
					screen.clear();
					screen.drawImage(fireworks, 10, 10, 2250 , 1000, null);
					screen.setFont(new Font("Algerian", Font.BOLD, 75));
					screen.setColour(Color.WHITE);
					screen.drawString("PLAYER 2 WINS", 1250,200);
					Thread.sleep(5000);
					winner = true;
				}
			}

			else if (diceNumber == 2)
			{
				if (player1Score >= 100 && player2Score < 100)// If player 1 has a score greater or equal to 100 but player 2 is less than 100
				{
					screen.clear();
					screen.drawImage(fireworks, 10, 10, 2250 , 1000, null);
					screen.setFont(new Font("Algerian", Font.BOLD, 75));
					screen.setColour(Color.WHITE);
					screen.drawString("PLAYER 1 WINS", 1250,200);
					Thread.sleep(3500);
					winner = true;
				}
				else if (player2Score >= 100 && player1Score < 100)// If player 2 has a score greater or equal to 100 but player 1 is less than 100
				{
					screen.clear();
					screen.drawImage(fireworks, 10, 10, 2250 , 1000, null);
					screen.setFont(new Font("Algerian", Font.BOLD, 75));
					screen.setColour(Color.WHITE);
					screen.drawString("PLAYER 2 WINS", 1250,200);
					Thread.sleep(3500);
					winner = true;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Instructions() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{
		screen.setFont(new Font("Algerian", Font.BOLD, 75));
		screen.setColour(Color.red);
		screen.drawString("HOW TO PLAY",700,110);
		screen.setColour(Color.BLACK);
		screen.drawString("1 DICE:", 100, 200);
		screen.setFont(new Font("Arial", Font.BOLD, 20));
		screen.drawString("Two players will alternate rolling die until the first player reaches 50 points.", 100, 250);
		screen.drawString("To obtain points a player will role the die. What number you land will add ", 100, 275);
		screen.drawString("to their runnig total, but if you land on a 1 then your score will be reduced ", 100, 300);
		screen.drawString("to 0. A player can role as many times as they'd like. 'ENTER' will role the die ", 100,325);
		screen.drawString("again and 'SPACE' wil end the players turn. ", 100,350);

		for (int i = 0; i < 20; i ++)
		{
			screen.drawString("|", 950, dividerCounter);
			dividerCounter = dividerCounter + 10;
		}
		screen.setFont(new Font("Algerian", Font.BOLD, 75));
		screen.drawString("2 DICE:", 1100, 200);
		screen.setFont(new Font("Arial", Font.BOLD, 20));
		screen.drawString("Two players will alternate rolling dice until the first person reaches 100 points",1100,250);
		screen.drawString("to obtain points a player will role two dice. The sum of the two dice will be ",1100,275);
		screen.drawString(" added to their running total, but if the dice land on a double then the players",1100,300);
		screen.drawString(" score is set to 0. A player can role as many times as they'd like. 'ENTER' will ",1100,325);
		screen.drawString("role the dice again and 'SPACE' wil end the players turn.", 1100,350);
		screen.setFont(new Font("Algerian", Font.BOLD, 35));
		screen.setColour(Color.RED);

		screen.drawString("Choose one of the two options to play:", 550, 540);
		screen.setColour(Color.BLACK);
		screen.setFont(new Font("Algerian", Font.BOLD, 75));
		screen.drawString("_______", 580, 600);
		screen.drawString("|1 dice|", 560, 670);
		screen.drawString("_______", 580, 680);
		screen.drawString("_______", 1020, 600);
		screen.drawString("|2 dice|", 1000, 670);
		screen.drawString("_______", 1020, 680);


		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.err.println("Sleep Interrupted");
			}
			if ((x > 596 && x < 889) && (y > 690 && y < 766))
			{
				screen.clear();
				diceNumber = 1;
				OneDice();
			}
			else if ((x > 1040 && x < 1326) && (y > 690 && y < 766))
			{
				screen.clear();
				diceNumber = 2;
				TwoDice();
			}
		}
	}
}	