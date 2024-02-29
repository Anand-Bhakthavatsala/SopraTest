package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");
		driver.get("https://demoqa.com/buttons");
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1000)");
		 */
		//Actions class
		Actions a = new Actions(driver);
		
		//Retrieve the element
		WebElement btnE1 = driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(2000);
		a.doubleClick(btnE1).perform();
		System.out.println("Double click performed");
	}

}
