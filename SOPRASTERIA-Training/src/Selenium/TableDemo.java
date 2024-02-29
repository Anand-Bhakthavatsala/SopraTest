package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		//Identify the total no of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
		//print all the headers of the table 
		/*
		 * for(int i=0;i <columns.size();i++) {
		 * System.out.println(columns.get(i).getText()); }
		 */
		
		for(WebElement header:columns)
		{
			System.out.println(header.getText());
		}
		//to identify the element/object, then perform the action
		//linktext way
		driver.findElement(By.linkText("Testing")).click();
		driver.findElement(By.partialLinkText("Test")).click();
		//xpath
		driver.findElement(By.xpath("//a[starts-with(text(),'Testing')]")).click();
	}

}
