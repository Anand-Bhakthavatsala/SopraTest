package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM extends BaseClass{

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\SOPRASTERIA-Training\\src\\Selenium\\data.properties");
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//it is pointing to data.properties file
		String name=prop.getProperty("usrname");
		String password=prop.getProperty("pwd");
		
		invokeBrowser("firefox");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		
		//login
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Syncronization- conditional wait
		WebDriverWait d = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement pname= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		d.until(ExpectedConditions.elementToBeClickable(pname));
		pname.click();
		
		//logout
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		//close browser
		closeBrowser();
	}

}
