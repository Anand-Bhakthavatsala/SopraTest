package Selenium;

import org.openqa.selenium.By;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
		driver.get("file:///D:/Automation/html/iframpage.html");
		driver.findElement(By.id("t1")).sendKeys("hello");
		
		driver.switchTo().frame(0);//switch to frame
		driver.findElement(By.id("t2")).sendKeys("Automation");
		driver.findElement(By.id("t3")).sendKeys("Selenium");
		
		//main window
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Learning");
		
		
	}

}
