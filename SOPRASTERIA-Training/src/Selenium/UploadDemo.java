package Selenium;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class UploadDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		/*
		 * driver.get(
		 * "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php"
		 * ); JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1500)"); Thread.sleep(2000);
		 */
		
		//identify the element
		//driver.findElement(By.xpath("//input[@id='picture']")).click();
		//driver.findElement(By.name("picture")).click();
		
		//Relative example
		//driver.findElement(with(By.tagName("input")).above(By.tagName("textarea"))).click();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(2000);
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\Hp\\OneDrive\\Documents\\Zoom\\2024-02-22 07.32.16 Core Java - Day3\\chat.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
		
	}

}
