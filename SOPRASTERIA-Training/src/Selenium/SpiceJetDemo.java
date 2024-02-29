package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://book.spicejet.com/");
		
		//identifying the city from
		driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		//to city
		driver.findElement(By.xpath("(//a[@value='IDR'][normalize-space()='Indore (IDR)'])[2]")).click();
		Thread.sleep(2000);
		//select the current date
		driver.findElement(By.xpath("//a[contains(.,'21')]")).click();
		//how to select the future month & date - assignment
		
	}

}
