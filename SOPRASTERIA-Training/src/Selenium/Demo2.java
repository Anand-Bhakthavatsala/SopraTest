package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.navigate().to("https://karmawholetech.business.site/");
		
		driver.findElement(By.xpath("//a[@id='action-list-2']")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[contains(@aria-label,'Choose')]"));
		search.click();
		System.out.println(search.getText());
		search.sendKeys("Hello");
	}

}
