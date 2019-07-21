package alertScreenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("E:\\VMETRY COURSE\\confirmation.html");
		
		driver.findElement(By.xpath("/html/body/form/input")).click();
		
		Thread.sleep(1500);
		
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("C:\\SeleniumWorkspace\\ArunPractice\\File\\test.png"));
 
		System.out.println("Full Desktop screenshot saved!");

	}

}
