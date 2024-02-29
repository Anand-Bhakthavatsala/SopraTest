package Selenium;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("E:\\Anand\\Automation\\AutomationData.xlsx");
		
		//Idenitfy the workbook in the excel
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Selenium");
		int rows = sheet.getPhysicalNumberOfRows();//Count the rows
		System.out.println("No of records in the Selenium sheet :"+rows);
		
		int columns = sheet.getRow(0).getPhysicalNumberOfCells();//No of columns
		System.out.println("No of columns in Selenium sheet :"+columns);
			
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");//print the data		
			/*	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();*/
			}
			System.out.println();
		}
	}

}
