package chennaiProgram;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyReadandGoogleLoad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	 File f=new File("C:/SeleniumWorkspace/ArunPractice/File/URL.properties");
	 
	 FileInputStream fis=new FileInputStream(f);
	 
	 Properties prop=new Properties();
	 
	 prop.load(fis);
	 
	 String s=prop.getProperty("url");
	 
	 //System.out.println(prop.getProperty("url"));
	 
	 WebDriver driver=new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get(s);
	 
	 System.out.println("URL launched successfully");
	 
	 Thread.sleep(1500);
	 
	 driver.close();

	}

}
