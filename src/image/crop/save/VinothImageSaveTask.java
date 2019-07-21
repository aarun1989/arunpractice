package image.crop.save;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VinothImageSaveTask {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("file:///E:/VMETRY%20COURSE/image.html");

		String Basepath="/html/body/img[";

		String endpath="]";
		
		String basetext="/html/body/p[";
		
		String endtext="]";

		for(int i=1;i<=10;i++)

		{

			String updatedpath=Basepath+i+endpath;
			
			
			String updatedtext=basetext+i+endtext;

			WebElement ele=driver.findElement(By.xpath(updatedpath));
			
			String eletext=driver.findElement(By.xpath(updatedtext)).getText();
			
			System.out.println("Text value "+eletext);

			Point point=ele.getLocation();

			int x=point.x;

			int y=point.y;

			int height=ele.getSize().height;

			int width=ele.getSize().width;

			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			BufferedImage image=ImageIO.read(src);

			BufferedImage cropimage=image.getSubimage(x, y, width, height);

			ImageIO.write(cropimage, "png", src);
			
			String filepath="C:/SeleniumWorkspace/WebdriverTest/screenshot/";
			
			String fileendpath=".png";

			FileUtils.copyFile(src, new File(filepath+eletext+fileendpath));
		}

		driver.close();

	}

}
