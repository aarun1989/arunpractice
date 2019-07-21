package filehandlingTest.arun.ExcelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:/SeleniumWorkspace/ArunPractice/File/TestExcel.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("arun");
		
		int row=sheet.getLastRowNum()+1;
		
		int column=sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		
		System.out.println(column);
		
		String data=sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data);
	}

}
