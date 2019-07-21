package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https:/www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("anandarajarun@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("#Dandom1989");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		
	}

}
