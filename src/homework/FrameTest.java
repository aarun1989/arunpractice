package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame(0);

		WebElement ele=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[4]/div[1]/div/div/div/div/h2/span"));
		
		System.out.println("Text is "+ele.getText());
		
		driver.close();

	}

}
