package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	static WebDriver driver; //interface in Selenium
	
	public static void main(String[] args) throws InterruptedException {
		// invoke the chrome browser
		String browser="chrome";
		
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();//firefox browser
		//implicit wait for max of 10 sec 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		//identifying the search box
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");//type Selenium
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);//2 secs
		String title = driver.getTitle();//capture the title
		
		System.out.println(title+ "All the steps are executed");
		if(title.equals("Selenium - Google Search"))
		{
			System.out.println("Test case title matching");
		}
		else
			System.out.println("Title not matching");
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();//close the browser window
	}

}
