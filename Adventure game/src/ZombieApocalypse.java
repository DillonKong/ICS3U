import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import hsa_new.Console;

/* Writers:
 * Dillon Kong (South Half)
 * Paola Ronnie (North Half)
 * Zombie Apocalypse
 */

public class ZombieApocalypse{

	public static BufferedImage  picZombieWindow = null, clinicPic = null, picZombieKid = null, picRunningAway = null, picFire = null, picDarkRoom = null, picAbandonedB = null, picAbandonedHouse = null, picStrangeMan = null, picFireHouse = null, picFireWorks = null, picFoodBasics = null, picFirework = null, picTheEnd = null, picClinic = null;
	public static BufferedImage  picGunAddress = null, picHelicopter = null, picDownStairs = null, picStairs = null, picFruitBread = null, picRottenBuildings = null, picWinBattle, picYouWin = null, picGameOver = null, picLock = null, picHouse = null, picStreet = null, picBasement = null, picDog = null, picBag = null, picStore = null; 

	public static void main(String[] args) throws InterruptedException {
		
		//Set up console
		Console c = new Console (125,135);
		
		//Set background color to black
		c.setTextBackgroundColor(Color.BLACK);
		c.clear();
		//Set font color to white
		c.setTextColor(Color.WHITE);

		try{
			//SOUTH
			//Images
			picStreet = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("abandonedStreet1.png"));
			picHouse = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("hosue1.jpg"));
			picBasement = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("basement.jpg"));
			picDog = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("smiledog_jpg_by_jcm2-d6mss3e.jpg")); 
			picBag = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("untitled.png"));
			picStore = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("Convenience-store.jpg"));
			picFirework = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("Firework.jpg"));
			picTheEnd = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("TheEnd.jpg"));
			picLock = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("lock.jpg"));
			picClinic =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("clinic2.jpg"));

			//Noise clips
			Clip zombie = AudioSystem.getClip();
			zombie.open(AudioSystem.getAudioInputStream(new File("Zombie Moan-SoundBible.com-565291980.wav")));
			Clip gunShot = AudioSystem.getClip();
			gunShot.open(AudioSystem.getAudioInputStream(new File("9_mm_gunshot-mike-koenig-123.wav")));
			Clip eating = AudioSystem.getClip();
			eating.open(AudioSystem.getAudioInputStream(new File("Eating-SoundBible.com-1470347575.wav")));
			Clip dog = AudioSystem.getClip();
			dog.open(AudioSystem.getAudioInputStream(new File("Dog Growling And Barking-SoundBible.com-883632423.wav")));
			Clip car = AudioSystem.getClip();
			car.open(AudioSystem.getAudioInputStream(new File("Full Throttle-SoundBible.com-602352574.wav")));
			Clip zombieOne = AudioSystem.getClip();
			zombieOne.open(AudioSystem.getAudioInputStream(new File("Zombie Demon Spawn-SoundBible.com-1532920645.wav"))); 
			Clip win = AudioSystem.getClip();
			win.open(AudioSystem.getAudioInputStream(new File("Ta Da-SoundBible.com-1884170640.wav")));

			//NORTH
			//pictures
			clinicPic =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("clinic2.jpg"));
			picFire =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("clinic2.jpg"));
			picAbandonedB =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("ABANDONED BUILDINGS.jpg"));
			picFireWorks =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("fireworks.jpg"));
			picFireHouse = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("fire window.jpg"));
			picZombieKid =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("clinic2.jpg"));
			picStrangeMan =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("strangeman fight.jpg"));
			picDownStairs =ImageIO.read(ZombieApocalypse.class.getResourceAsStream("downstairs.jpg"));
			picStairs = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("downstairs.jpg"));
			picFoodBasics = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("Food basics.jpg"));
			picZombieWindow = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("lotwindow1zombie apocalypsis.jpg"));
			picWinBattle = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("win battle with man.jpg"));
			picFruitBread = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("fruit-bread.jpg"));
			picGunAddress = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("gun and address.jpg"));
			picRottenBuildings = ImageIO.read(ZombieApocalypse.class.getResourceAsStream("ROTTEN BAUILDINGS.jpg"));
			picRunningAway= ImageIO.read(ZombieApocalypse.class.getResourceAsStream("pic1runnig away.jpg"));
			picYouWin =  ImageIO.read(ZombieApocalypse.class.getResourceAsStream("YOU SUPER WIN.jpg"));
			picGameOver= ImageIO.read(ZombieApocalypse.class.getResourceAsStream("GAME OVER !.jpeg"));

			//clips
			Clip fire = AudioSystem.getClip();
			fire.open(AudioSystem.getAudioInputStream(new File("House_on_Fire-Mike_Koenig-927153283.wav")));
			Clip horrorSound = AudioSystem.getClip();
			horrorSound.open(AudioSystem.getAudioInputStream(new File("Evil_Laugh_1-Timothy-64737261.wav")));
			Clip manCough = AudioSystem.getClip();
			manCough.open(AudioSystem.getAudioInputStream(new File("Man Coughing-SoundBible.com-534729802.wav")));
			Clip basement = AudioSystem.getClip();
			basement.open(AudioSystem.getAudioInputStream(new File("Old Door Creaking-SoundBible.com-1197162460.wav")));
			Clip dogGrowling = AudioSystem.getClip();
			dogGrowling.open(AudioSystem.getAudioInputStream(new File("Dog Growling And Barking-SoundBible.com-883632423.wav")));
			Clip scream = AudioSystem.getClip();
			scream.open(AudioSystem.getAudioInputStream(new File("Scary Scream-SoundBible.com-1115384336.wav")));
			Clip zombie1 = AudioSystem.getClip();
			zombie1.open(AudioSystem.getAudioInputStream(new File("I Want Brains-SoundBible.com-814171004.wav")));
			Clip yesAnswer = AudioSystem.getClip();
			yesAnswer.open(AudioSystem.getAudioInputStream(new File("Yes-SoundBible.com-1345875982.wav")));
			Clip motor = AudioSystem.getClip();
			motor.open(AudioSystem.getAudioInputStream(new File("Full Throttle-SoundBible.com-602352574.wav")));
			Clip applause = AudioSystem.getClip();
			applause.open(AudioSystem.getAudioInputStream(new File("Audience_Applause-Matthiew11-1206899159.wav")));

			
			@SuppressWarnings("unused")
			Boolean alive = true;
			// While loop for playing again
			while (alive = true)
			{
				c.clear();
				//VARIABLES
				String answer1 = null, answerS1 = null, answerS4 = null, answerS5 = null, answerS6 = null, answerS7 = null, answerS8 = null, playAgain = null;
				int rndNumS1 = (int) (Math.random() * 11) + 1, rndNumS3 = (int) (Math.random() * 11) + 1, rndNumS4 = (int) (Math.random() * 5) + 1,rndNumS5 = (int) (Math.random() * 5) + 1, rndNumS6 = (int) (Math.random() * 11) + 1;
				int numS1 = 0, numS2 = 0, numS3 = 0;

				//*************************************************************************************************************************
				//*************************************************************************************************************************

				c.drawImage(picStreet, 50, 100 , 1000, 750, null);
				c.println("You wake up in the street. A zombie apocalypse has started. The street goes North and South, where would you like to go? (North or     South)");
				answer1= c.readString();

				while (!answer1.equalsIgnoreCase("north") && !answer1.equalsIgnoreCase("South"))
				{
					c.clear();
					c.println("Invalid Input.");
					c.print("The street goes North and South, where would you like to go? (North or South)");
					answer1 = c.readLine();
				}

				if (answer1.equalsIgnoreCase ("north")){
					c.println("you just founded a baseball bat. Do you pick it up? (yes or no)");
					answer1 = c.readLine();
					c.drawImage(picRottenBuildings, 100, 100, 750, 750, null);
					c.clear();
					c.println("Sudennly you start hearing noises and you follow them. You see someone who looks like a zombie. He sees you then you fight him.");
					c.drawImage(picStrangeMan, 100, 100, 750, 750, null);


					if (rndNumS1 >= 1 && rndNumS1 <=5) {//50% you win
						Thread.sleep(1500);

						c.println("You lose battle and he hits you in the head. Wake up tied up in a bed inside what it looks like an old house. Do you try to escape? (yes or no)");
						answer1 = c.readLine();

						c.drawImage(picAbandonedHouse, 100, 100, 750, 750, null);
						horrorSound.start();

						c.clear();                    

						if (answer1.equalsIgnoreCase ("no")) {
							c.println("A man comes after a while and tell you he wants to help you. Do you say that you believe him? (yes or no)");
							c.drawImage(picAbandonedHouse, 100, 100, 750, 750, null);
							answer1 = c.readLine();
							c.clear();

							if (answer1.equalsIgnoreCase ("yes")) {
								c.println("The man unties you tells you to follow him to the basement? (yes or no)");
								answer1 = c.readLine();
								c.drawImage(picAbandonedHouse, 100, 100, 750, 750, null);
								yesAnswer.start();

								c.clear();
								if (answer1.equalsIgnoreCase("yes") );
								c.println("You follow him along the basement bull dog attacks you. Now you are this man food ! you loose");
								dogGrowling.start();
								basement.start();
								c.drawImage(picStairs, 100, 100, 750, 750, null);

								Thread.sleep(1500);
								c.println("Do you want to play again? (yes or no)");
								c.drawImage(picRottenBuildings, 100, 100, 750, 750, null);
								eating.start();

								answer1 = c.readLine();
								if ( answer1.equalsIgnoreCase ("yes")){
									alive = true;
								}
								else{
									c.close();
								}
							}
							else if (answer1.equalsIgnoreCase ("no")) {
								c.println("the man kills you! You lose!");
								manCough.start();
								c.drawImage(picTheEnd, 100, 100, 750, 750, null);
								Thread.sleep(1500);
								c.println("Do you want to play again? (yes or no");
								answer1 = c.readLine();
								if ( answer1.equalsIgnoreCase ("yes")){
									alive = true;
								}
								else{
									c.close();
								}
								c.clear();
							}
							else{
								c.close(); }
						}

						else if (answer1.equalsIgnoreCase ("yes")){
							c.println("You are free and run to the street. He is following you! You come to an avenue. Do you go left or right? (left or right)");
							answer1 = c.readLine();
							c.drawImage(picFoodBasics, 100, 100, 750, 750, null);
							//	suspense.start();
							c.clear();

							if (answer1.equalsIgnoreCase ("left")) {
								c.println("You get to a park an finally get rid of the man. You keep walking north. Then you enter a food basics to collect one kind of food. Do you chose cans or fruits? (Cans or Fruits)");
								answer1 = c.readLine();
								c.drawImage(picFruitBread, 100, 100, 750, 750, null);


								if (answer1.equalsIgnoreCase("fruits")) {
									c.clear();
									c.println("you carry the food to a clinic that is next to the food basics. You hear weird noises. You find a girl in the floor transforming into a zombie. She tries to say something to you. Do you shoot or try to help? (shoot or help)");
									scream.start();
									answer1 = c.readLine();
									
									if (answer1.equalsIgnoreCase ("shoot")){
										c.clear();
										c.println("When shoot makes a lot of noise and a group of zombies near by come to eat you! You lose!");
										Thread.sleep(1500);
										c.println("Do you want to play again? (yes or no");
										answer1 = c.readLine();

										if ( answer1.equals ("yes")){
											alive = true;
											c.clear();
										}
										else{
											c.close();
										}
									}

									else if (answer1.equalsIgnoreCase ("help")){
										c.print(" The girl is pointing to 3 different medicines in the desk. Make a random guess between yellow, red or blue pills?");
										
										if (answer1.equals ("red")){
											c.println("SHE GETS CURED, SHE HAS A WORKING PHONE! CALLS HER CONTACTS, RESCUE IS ON THE WAY ! YOU SURVIVED AND FOUND THE CURE ! CONGRATS !"); }
										else
											applause.start();
										c.drawImage(picYouWin, 100, 100, 750, 750, null);

										{
											c.close();
										}
									}
									else{
										c.close();
									}
								}
								else if (answer1.equalsIgnoreCase("cans")) {
									c.println("You make sound with cans. Zombies find you. You throw them cans but is a failure. You lose.");
									//	cansfalling.start();
									zombie1.start();
									c.drawImage(picGameOver, 100, 100, 750, 750, null);
									answer1 = c.readLine();
									c.clear();
								}
								else {
									c.close();
								}

							}

							else if (answer1.equalsIgnoreCase ("right")) {
								c.println("there is a huge group of real zombies they eat you!");
								zombie1.start();
								c.drawImage(picRunningAway, 100, 100, 750, 750, null);

								Thread.sleep(1500);
								c.println("Do you want to play again? (yes or no");
								answer1 = c.readLine();
								zombie1.start();
								c.drawImage(picGameOver, 100, 100, 750, 750, null);
								c.clear();

								if ( answer1.equalsIgnoreCase ("yes")){
									alive = true;
									c.clear();
								}
								else{
									c.close();
								}

							}
							else{
								c.close();
							}
						}
						else{
							c.close();
						}

					}

					else if (rndNumS1 >= 5 && rndNumS1 <=10) {// 50% win and 50% lose
						c.println("You win battle. You notice that this is not a zombie is a real human being. He has a backpack. Do you check him or his backpack? (pockets or backpack)");
						answer1 = c.readLine();
						c.drawImage(picWinBattle, 100, 100, 750, 750, null);
						applause.start();

						c.clear();
						if (answer1.equalsIgnoreCase ("pockets")){
							c.println("In both pockets there is a gun and a  wallet with a home address. You follow the direction still going north. Find the house and enter. You go after the fridge and stove to warm up some food. Meanwhile you and either you will check one floor up or basement or do you stay. (up or down or stay)");
							c.drawImage(picStairs, 100, 100, 750, 750, null);
							answer1 = c.readLine();
							
							if (answer1.equalsIgnoreCase ("down")){
								c.clear();
								c.println("There is a huge dog in the basement. You try to shoot him, when you notice he is infected. However he is too fast and kills you. Game over");
								dogGrowling.start();
								c.drawImage(picDog, 100, 100, 750, 750, null);
								Thread.sleep(1500);
								c.println("Do you want to play again? (yes or no");
								zombie1.start();
								c.drawImage(picGameOver, 100, 100, 750, 750, null);
								answer1 = c.readLine();

								if ( answer1.equalsIgnoreCase ("yes")){
									alive = true;
									c.clear();
								}
								else{
									c.close();
								}
							}
							else if (answer1.equalsIgnoreCase ("up")){
								c.println("There is a dark room. You start to search the room. Suddenly a dog comes do you shoot him?! (yes or no)");
								c.drawImage(picDarkRoom, 100, 100, 750, 750, null);
								horrorSound.start();
								
								if (answer1.equals ("no"))
								{
									c.println("he attacks you. You die!");
									zombie1.start();
									c.drawImage(picGameOver, 100, 100, 750, 750, null);

									Thread.sleep(1500);
									c.println("Do you want to play again? (yes or no");
									zombie1.start();
									c.drawImage(picGameOver, 100, 100, 750, 750, null);

									answer1 = c.readLine();
									c.clear();
									if ( answer1.equalsIgnoreCase ("yes")){
										alive = true;
										c.clear();
									}
									else{
										c.close();
									}
								}
								else if (answer1.equalsIgnoreCase ("yes")){
									c.println("You shoot the infected dog and find out that there is a firework gun ! After you shoot it to the sky there is an helicopter to your rescue ! You have survived !");
									c.drawImage(picFirework, 250, 250, 750, 750, null);
									applause.start();
								}
								else{
									c.close();
								}
							}

							else if (answer1.equalsIgnoreCase ("stay")) {
								c.clear();
								c.println("You keep eating and try to turn the stove more to heat up faster the food but instead you cause a fire and you die!");
								fire.start();
								c.drawImage(picFireHouse, 250, 250, 750, 750, null);
								Thread.sleep(1500);
								fire.stop();
								c.clear();
								c.println("Do you want to play again? (yes or no");
								answer1 = c.readLine();
								c.drawImage(picTheEnd, 100, 100, 750, 750, null);
								if ( answer1.equalsIgnoreCase ("yes")){
									alive = true;
									c.clear();
								}
								else{
									c.close();
								}
							}
							else {
								c.close();
							}
						}


						else if (answer1.equalsIgnoreCase ("backpack")){
							c.println("In the first zipper you find a bottle water and a couple of cans but when you turn around the man is in his feet and shoots you. You die");
							gunShot.start();
							c.drawImage(picGameOver, 100, 100, 750, 750, null);

							Thread.sleep(1500);
							c.println("Do you want to play again? (yes or no");

							answer1 = c.readLine();
							c.clear();
							if ( answer1.equalsIgnoreCase ("yes")){
								alive = true;
								c.clear();
							}
							else{
								c.close();
							}
						}
						else {
							c.close();
						}
					}
				}
				//*************************************************************************************************************************
				//*************************************************************************************************************************

				else if (answer1.equalsIgnoreCase("South"))
				{
					c.clear();
					c.drawImage(picHouse, 50, 100 , 700, 750, null);
					c.println("You walk for several hours until you come across a house and it seems undamaged so you enter. The house has a basement (B), ground floor (G) and an upper floor (U). Which floor whould you like to go? (B, G, U)");
					answerS1 = c.readString();

					while (!answerS1.equalsIgnoreCase("b")  &&  !answerS1.equalsIgnoreCase("u")  &&  !answerS1.equalsIgnoreCase("g"))
					{
						c.clear();
						c.println("Invalid Input.");
						c.print("The house has a basement (B), ground floor (G) and an upper floor (U). Which floor whould you like to go? (B, G, U)");
						answerS1 = c.readLine();
					}

					if (answerS1.equalsIgnoreCase ("B"))
					{
						c.clear();
						c.drawImage(picBasement, 50, 100, 700, 750, null);
						c.println("You walk down the stairs, being wary of your surroundings, you look around the dark basement. On the shelf to your left you see a gun and cans of food. You only have room to carry one of these items. Which do you pick up? (gun or food)");
						answerS4 = c.readString();

						while (!answerS4.equalsIgnoreCase("gun") &&  !answerS4.equalsIgnoreCase("food"))
						{
							c.println("Invalid Input.");
							c.print("On the shelf to your left you see a gun and cans of food. You only have room to carry one of these items. Which do you pick up? (gun or food)");
							answerS4 = c.readLine();
						}
						if (answerS4.equalsIgnoreCase ("gun"))
						{
							c.clear();
							Thread.sleep(500);
							c.println("You leave the house and continue south on your journey. A little later you come across a convience store locked by a small padlock. It's locked, but you hear growling coming around the corner.");
							Thread.sleep(1500);
							c.drawImage(picStore, 100 , 100 , 700, 700, null);
							Thread.sleep(1000);
							zombie.start();
							c.println("You look at the padlock and it only has 10 possibilities 1-10. Which number do you choose; you only have time to try three.");

							for (int i = 0; i <= 2; i++)// Loop for 3 tries
							{
								Thread.sleep(1000);
								c.println("What number do you chose?");
								numS1 = c.readInt();

								if (numS1 == rndNumS6)
								{
									c.drawImage(picLock, 50, 100, 700, 750, null);
									Thread.sleep(1500);
									c.clear();
									c.println("The lock unlocks and you enter the store and there's several cans of food on the shelf and a gun under the counter. Would you like to pick them up? (Yes or No)");
									answerS7 = c.readString();

									while (!answerS7.equalsIgnoreCase("yes")  &&  !answerS7.equalsIgnoreCase("no"))
									{
										c.clear();
										c.println("Invalid Input.");
										c.print("Would you like to pick them up? (Yes or No)");
										answerS7 = c.readLine();
									}

									if (answerS7.equalsIgnoreCase("yes"))
									{
										c.clear();
										c.println("You gather the supplies and leave from the back of the store.");
										Thread.sleep(100);
										c.println("As you step out, you're surrounded by a hord of zombies. Do you fight them or run back into the store? (Fight or Run)");
										zombie.start();
										answerS8 = c.readString();

										while (!answerS8.equalsIgnoreCase("fight") && !answerS8.equalsIgnoreCase("run"))
										{
											c.clear();
											c.println("Invalid Input.");
											c.print("Do you fight them or run back into the store? (Fight or Run)");
											answerS8 = c.readLine();
										}

										if (answerS8.equalsIgnoreCase("fight"))
										{
											if (rndNumS3 >= 1 && rndNumS3 <= 6)// 60 % success
											{
												c.clear();
												gunShot.start();
												gunShot.start();
												gunShot.start();
												c.println("You pull out the gun you just picked up and unload into the hord.");
												Thread.sleep(1500);
												c.println("You eventually kill the hord but you some how got cut, it may be infected. Before more zombies find you, you search the parking lot.");
												Thread.sleep(1500);
												c.println("There are 5 cars in the lot but you only have time to check 2. Which car do you try first? (1-5)");
												Thread.sleep(7000);

												for (int t = 0; t <= 2; t++)//loop for 3 tries
												{
													c.clear();
													c.println("What's the next car you would like to pick?");
													numS2 = c.readInt();

													if (numS2 == rndNumS4)
													{
														c.println("You check the car " + numS2);
														Thread.sleep(7500);
														car.start();
														c.println("The car runs and has a full tank of gas. You drive off into the sunset; you just survived the zombie apocalypse. THE END");
														i = 3;
														win.start();
														c.drawImage(picFirework, 250, 250, 700, 700, null);
														Thread.sleep(2500);
														c.println("Do you want to play again? (yes or no)");
														playAgain= c.readLine();

														if (playAgain.equalsIgnoreCase ("yes"))
															alive = true;
														else if (playAgain.equalsIgnoreCase ("no"))
															c.close();
													}//END

													else
														c.clear();
													c.println("The car you chose didn't start, so you move on to the next one.");
													Thread.sleep(7000);
												}
												c.clear();
												c.println("You pass out because you have lost to much blood. You don't wake up ever again. THE END");
												c.drawImage(picTheEnd, 250, 250, 700, 700, null);
												Thread.sleep(1500);
												c.println("Do you want to play again? (yes or no)");
												playAgain= c.readLine();

												if (playAgain.equalsIgnoreCase ("yes"))
													alive = true;
												else if (playAgain.equalsIgnoreCase ("no"))
													c.close();
											}
										}//END

										else
											c.clear();
										zombieOne.start();
										c.println("You miss several of your shots so you try and run back inside, but a zombie grabs onto your bag. You get pulled backwards and get mauled. THE END");	
										c.drawImage(picTheEnd, 250, 250, 700, 700, null);
										Thread.sleep(1500);
										c.println("Do you want to play again? (yes or no)");
										playAgain= c.readLine();

										if (playAgain.equalsIgnoreCase ("yes"))
											alive = true;
										else if (playAgain.equalsIgnoreCase ("no"))
											c.close();
									}// END

									else if (answerS7.equalsIgnoreCase("no"))
									{
										c.clear();
										zombie.start();
										c.println("You leave the store through the back and see five cars parked in lot. You hear zombies in the distance so you only have time to try 2 cars.");

										for (int r = 0; r <= 1; r++)
										{ 
											c.println (" Which car do you chose? (1 - 5)");
											numS3 = c.readInt();

											if (numS3 == rndNumS5)
											{
												c.clear();
												c.println("You check car " + numS3);
												Thread.sleep(2000);
												c.println("The car runs and has a full tank of gas. You drive off into the sunset; you just survived the zombie apocalypse. THE END");
												win.start();
												c.drawImage(picFirework, 100, 100, 700, 700, null);
												Thread.sleep(2500);
												c.println("Do you want to play again? (yes or no)");
												playAgain= c.readLine();

												if (playAgain.equalsIgnoreCase ("yes"))
													alive = true;
												else if (playAgain.equalsIgnoreCase ("no"))
													c.close();
											}//END

											else{
												c.clear();
												c.println("The car you chose didn't start, so you move on to the next one.");
											}

											c.clear();
											c.println("You pass out because you have lost to much blood. You don't wake up ever again. THE END");
											c.drawImage(picTheEnd, 250, 250, 700, 700, null);
											Thread.sleep(1500);
											c.println("Do you want to play again? (yes or no)");
											playAgain= c.readLine();
											if (playAgain.equalsIgnoreCase ("yes"))
												alive = true;
											else if (playAgain.equalsIgnoreCase ("no"))
												c.close();
										}
									}
								}//END

								else if (numS1 != rndNumS6)
								{
									c.clear();
									c.println("Wrong number, try again");
									Thread.sleep(1000);
								}
							}
							c.clear();
							zombieOne.start();
							c.println("You couldn't unlock the pad lock to get into the store and the zombies come around the corner and you get mauled. THE END");
							c.drawImage(picTheEnd, 250, 250, 700, 700, null);
							Thread.sleep(1500);
							c.println("Do you want to play again? (yes or no)");
							playAgain= c.readLine();
							if (playAgain.equalsIgnoreCase ("yes"))
								alive = true;
							else if (playAgain.equalsIgnoreCase ("no"))
								c.close();
						}

						else if (answerS4.equalsIgnoreCase("food"))
						{
							c.clear();
							c.println("You eat the food in the cans, leave the house and continue south down the road.");
							Thread.sleep(1500);
							c.println("Several hours later, you start to feel ill and slugish. You black out in the middle of the street");
							Thread.sleep(1500);
							c.println("You died and didn't survive the zombie apoclypse. THE END");
							c.drawImage(picTheEnd, 250, 250, 700, 700, null);
							Thread.sleep(1500);
							c.println("Do you want to play again? (yes or no)");
							playAgain= c.readLine();

							if (playAgain.equalsIgnoreCase ("yes"))
								alive = true;
							else if (playAgain.equalsIgnoreCase ("no"))
								c.close();
						}
					}
					else if (answerS1.equalsIgnoreCase ("G"))
					{
						c.clear();
						c.drawImage(picBag, 50, 100, 700, 750, null);
						c.println("You find a large bagpack, in the foyer, full of different supplies: cans of food, knives, clothing, a gun and it's bullets. Do you pick it up? (Yes or No)");
						answerS5 = c.readString();

						while (!answerS5.equalsIgnoreCase("yes")  &&  !answerS5.equalsIgnoreCase("no"))
						{
							c.clear();
							c.println("Invalid Input.");
							c.print("Would you like to pick them up? (Yes or No)");
							answerS5 = c.readLine();
						}

						if (answerS5.equalsIgnoreCase("yes"))
						{
							c.clear();
							zombieOne.start();
							c.println("You leave the house with the bag and are quickly surrounded by a hord of zombies. You can't run away fast enough because your bag is to heavy. You get overwhelmed and die. THE END");
							c.drawImage(picTheEnd, 250, 250, 700, 700, null);
							Thread.sleep(1500);
							c.println("Do you want to play again? (yes or no)");
							playAgain= c.readLine();

							if (playAgain.equalsIgnoreCase ("yes"))
								alive = true;
							else if (playAgain.equalsIgnoreCase ("no"))
								c.close();
						}// END

						else if (answerS5.equalsIgnoreCase("no"))
						{
							c.clear();
							zombieOne.start();
							c.println("You leave the house without the bag but are quickly surrounded by a hord of zombies. You die because you couldn't defend yourself or run away fast enough. THE END");
							c.drawImage(picTheEnd, 250, 250, 700, 700, null);
							Thread.sleep(1500);
							c.println("Do you want to play again? (yes or no)");
							playAgain= c.readLine();
							if (playAgain.equalsIgnoreCase ("yes"))
								alive = true;
							else if (playAgain.equalsIgnoreCase ("no"))
								c.close();
						}
					}//END

					else if (answerS1.equalsIgnoreCase ("U"))
					{
						c.clear();
						c.println("There's a very large, stray dog at the top of the stairs. Do you want to fight it or try and run away? (Fight or Run)");
						c.drawImage(picDog, 50, 100, 700, 750, null);
						dog.start();
						answerS6 = c.readString();

						while (!answerS6.equalsIgnoreCase("fight")  &&  !answerS6.equalsIgnoreCase("run"))
						{
							c.clear();
							c.println("Invalid Input.");
							c.print("Do you want to fight it or try and run away? (Fight or Run)");
							answerS6 = c.readLine();
						}

						if (answerS6.equalsIgnoreCase("fight"))
						{
							if (rndNumS1 >= 1 && rndNumS1 <= 5)// 50% win
							{
								c.clear();
								c.println("You win the fight against the dog and decide to eat it's remains because you haven't eaten in a while.");
								eating.start();
								Thread.sleep(1500);
								c.println("You leave the house, with a full stomatch, and continue on your journey. Several hours later you become very sick and throwup.");
								Thread.sleep(1500);
								c.println("You pass out because the dog was contaminated . THE END");
								c.drawImage(picTheEnd, 250, 250, 700, 700, null);
								Thread.sleep(1500);
								c.println("Do you want to play again? (yes or no)");
								playAgain= c.readLine();
								if (playAgain.equalsIgnoreCase ("yes"))
									alive = true;
								else if (playAgain.equalsIgnoreCase ("no"))
									c.close();
							}// END

							else 
							{
								c.clear();
								c.println("After a long tough fight against the dog, the dog emerges victorious. Your remains litter the upper floor of the house. THE END");
								c.drawImage(picTheEnd, 250, 250, 700, 700, null);
								dogGrowling.start();
								Thread.sleep(1500);
								c.println("Do you want to play again? (yes or no)");
								playAgain= c.readLine();
								if (playAgain.equalsIgnoreCase ("yes"))
									alive = true;
								else if (playAgain.equalsIgnoreCase ("no"))
									c.close();
							}
						}//END

						else if (answerS6.equalsIgnoreCase("run"))
						{
							c.clear();
							c.println("You turn to run back the way you came from.");
							Thread.sleep(1000);
							c.println("The dog catches up to you at the bottom of the stairs and you get mauled to death. THE END");
							c.drawImage(picTheEnd, 250, 250, 700, 700, null);
							Thread.sleep(1500);
							c.println("Do you want to play again? (yes or no)");
							playAgain= c.readLine();
							if (playAgain.equalsIgnoreCase ("yes"))
								alive = true;
							else if (playAgain.equalsIgnoreCase ("no"))
								c.close();
						}//END
					}				
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}