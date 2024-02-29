package Selenium;

import org.openqa.selenium.By;

public class SFDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pw")).sendKeys("admin123");
		driver.findElement(By.id("Login")).click();
		
		//validation check
		String errorMsg = driver.findElement(By.id("error")).getText();
		System.out.println(errorMsg);
		
		if(errorMsg.contains("Please check your username and password"))
		{
			System.out.println("Unable to login");
		}
		else 
			System.out.println("Login is successful");
	}

}
