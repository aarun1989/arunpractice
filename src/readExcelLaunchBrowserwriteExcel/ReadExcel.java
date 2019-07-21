package readExcelLaunchBrowserwriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcel {

	public static WebDriver driver;

	public static XSSFWorkbook workbook;

	public static XSSFSheet sheet,sheet1;

	public static int row,column;

	public static File f;

	public static FileOutputStream fos;

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		driver=new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https:/www.google.com/");

		Thread.sleep(1500);

		f=new File("C:/SeleniumWorkspace/ArunPractice/File/vinothexcel.xlsx");

		FileInputStream fis=new FileInputStream(f);

		workbook=new XSSFWorkbook(fis);

		sheet=workbook.getSheetAt(0);

		row=sheet.getLastRowNum()+1;	//to get last row in the sheet

		//column=sheet.getRow(0).getLastCellNum();

		System.out.println("Row present in excel "+row);

		System.out.println("Column present in excel "+column);

		String data;

		for(int i=0;i<row;i++)
		{

			data=sheet.getRow(i).getCell(0).getStringCellValue();	//to get value from row 0,1,2,3....

			System.out.println(data);

			WebElement ele=driver.findElement(By.name("q"));	//already browser launched and located element

			ele.sendKeys(data);

			ele.sendKeys(Keys.ENTER);							//sent value to textbox and performed enter event

			Thread.sleep(2000);

			String title=driver.getTitle();						//get title of current page

			System.out.println("Title of page is "+title);

			Thread.sleep(3000);

			sheet1=workbook.createSheet(data);					//create a new sheet in same workbook with name as samsung,nokia.....

			XSSFRow row1=sheet1.createRow(0);					//create row and assign it to row1

			XSSFCell cell=row1.createCell(0);					//create cell

			cell.setCellValue(title);							//set value of the cell with title of current page

			fos=new FileOutputStream(f);						//use file output stream to store the value and switch back the browser to google page

			driver.navigate().back();							//navigate back to google home page

			Thread.sleep(1500);									//repeat till last value in excel has been searched in google

		}

		workbook.write(fos);									//write the contents stored in outputstream into workbook

		fos.close();											//close outputstream to complete saving process

		driver.close();

	}

}	


