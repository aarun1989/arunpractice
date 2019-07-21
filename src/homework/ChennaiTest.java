package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChennaiTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/Chennai");

		WebElement ele=driver.findElement(By.xpath("//*[@id='mw-content-text']/div/p[2]"));

		String s=ele.getText();

		String[] arr=s.split("\\s");//to split paragraph and store it in array to compare 
		
		//"\\s" split word based on white space

		System.out.println("Length of Array"+arr.length);
		
		int count=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase("chennai"))
			{
				System.out.println("Element Chennai is present");
				count++;
			}
			System.out.println(arr[i]);
		}
		System.out.println("Count is "+count);
			
	}

}
