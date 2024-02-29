package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement searchBtn,luckyBtn;
	//	driver = new ChromeDriver();
		invokeBrowser("chrome");
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		WebElement search = driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> hints = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int no = hints.size();//count of suggestions
		String suggestion;
		for(int i=0;i<no;i++)
		{
			//print all the suggestions google
			System.out.println(hints.get(i).getText());
			suggestion = hints.get(i).getText();
			//condition inside the loop
			if(suggestion.contains("selenium ide"))
			{
				hints.get(i).click();
				break;
			}
			else
				System.out.println("Keyword not matching");
		}
		
		//closing the browser
		closeBrower();
		
	}
	//open browser method
	public static void invokeBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}
	//close browser method
	public static void closeBrower() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
