
import java.awt.*;
import hsa_new.Console;

public class ImageExample {

	static Console c;           // The output console

	public static void main (String[] args) throws InterruptedException
	{
		c = new Console (200,200);

		// These two lines load the image "robot.jpg" and give it the name "jpgImage"
		// Note that you have to include the package name in the file name
		Image jpgImage;
		jpgImage = Toolkit.getDefaultToolkit ().getImage ("ExampleCode/robot.jpg");

		// These two lines load the image "robot.gif" and give it the name "gifImage"
		Image gifImage;
		gifImage = Toolkit.getDefaultToolkit ().getImage ("ExampleCode/robot.gif");

		// NOTE - java can also handle images in the .png format, and will respect
		// transparency values.

		// This line displays the jpeg image at top left location 0, 0
		// Don't worry about what null means, but you do need to include it
		// Note that the image name "jpgImage" is the first parameter
		//c.drawImage (jpgImage, 0, 0, null);

		// These lines draw some more images scaled to 100 by 100 pixels.
		c.drawImage (jpgImage, 400, 0, 100, 100, null);
		c.drawImage (gifImage, 400, 100, 100, 100, null);
		c.drawImage (jpgImage, 400, 200, 100, 100, null);
		c.drawImage (gifImage, 400, 300, 100, 100, null);

		// *************************************
		// THE DRAWIMAGE COMMANDS ARE
		// c.drawImage(image, x, y, null) OR
		// c.drawImage(image, x, y, width, height, null)
		// *************************************

	} // main method
} // ImageTest class
