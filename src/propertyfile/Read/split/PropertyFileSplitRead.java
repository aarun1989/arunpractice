package propertyfile.Read.split;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class PropertyFileSplitRead {

	public static Properties prop;

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\SeleniumWorkspace\\ArunPractice\\src\\propertyfile\\Read\\split\\Object.properties");

		FileInputStream fis=new FileInputStream(f);

		Properties prop=new Properties();

		prop.load(fis);

		int length=prop.size();

		System.out.println(length);

		String str=prop.getProperty("Firstname");

		String[] parts = str.split("#");

		String part1 = parts[0];

		String part2 = parts[1]; 
		
		System.out.println("LocatorName "+part1+"\t"+"LocatorMethod "+part2);
	}
	
	public static void getWebElement(String locatorKey)
	{
		
	}
}