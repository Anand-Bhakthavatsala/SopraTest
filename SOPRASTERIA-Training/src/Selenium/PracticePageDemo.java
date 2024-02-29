package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class PracticePageDemo extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//radio1
		WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		System.out.println(radio1.isDisplayed());//true
		System.out.println(radio1.isEnabled());//true
		System.out.println(radio1.isSelected());//false
		radio1.click();
		System.out.println(radio1.isSelected());//false
		
		//radio3
		WebElement radio3=driver.findElement(By.cssSelector("input[value='radio3']"));
		radio3.click();
		//radio3.clear();
		
		//
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioBtns.size());//total no of radio buttons
		
		//Get the attribute value
		radioBtns.get(2).getAttribute("value");//radio3
		
		//All the 3 radio button values 
		for(int i=0;i<radioBtns.size();i++)
		{
			System.out.println(radioBtns.get(i).getAttribute("value"));
			System.out.println(radioBtns.get(i).isEnabled());
		}
		
		//identifyting drop down
		WebElement sel1 = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropwdown = new Select(sel1);
		dropwdown.selectByVisibleText("Option1");
		Thread.sleep(2000);
		dropwdown.selectByValue("option2");
		Thread.sleep(2000);
		dropwdown.selectByIndex(3);
		
		//Alert handling
		//driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.id("alertbtn"));
		//System.out.println(a.getText());
		a.click();Thread.sleep(2000);//force-full sleep for 2 secs
		driver.switchTo().alert().accept();//click ok
		WebElement confAlert = driver.findElement(By.id("confirmbtn"));
		confAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();//cancel
		//Screenshot method
		/*
		 * File src=null; src =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); Files.copy(src,
		 * new File("./screenshot"+"page"+System.currentTimeMillis()+".png"));
		 */
		//auto suggestion - using keyboard
		WebElement auto = driver.findElement(By.id("autocomplete"));
		auto.click();
		auto.sendKeys("india");Thread.sleep(2000);
		auto.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);//once
		
		screenShot();//re-usable
		
		closeBrowser();
	}
}

