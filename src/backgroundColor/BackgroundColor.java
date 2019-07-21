package backgroundColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class BackgroundColor {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.navigate().to("file:///E:/VMETRY%20COURSE/inputbox.html");

		Thread.sleep(1500);

		WebElement ele=driver.findElement(By.name("firstname"));

		ele.click();

		String color=ele.getCssValue("background-color");

		System.out.println(color);

		String hex = Color.fromString(color).asHex();

		System.out.println(hex);
		
		Color colorr;

		driver.close();

	}

}
