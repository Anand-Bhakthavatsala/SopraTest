package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class SFDemoProperties extends BaseClass{

	public static void main(String[] args) throws IOException {
		// Properties file
		FileInputStream fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\SOPRASTERIA-Training\\src\\Selenium\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);//it is pointing to data.properties file
		String name=prop.getProperty("usrname");
		String password=prop.getProperty("pwd");
		
		invokeBrowser("chrome");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("pw")).sendKeys(password);
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
