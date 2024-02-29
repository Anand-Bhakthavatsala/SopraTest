package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class BaseClass {
	
	static WebDriver driver=null;
	public static void invokeBrowser(String browser) //user defined method/function - Reusable
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver112\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver_v32\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//System.setProperty("webdriver.edge.driver", "C:\\drivers\\edge112\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}		
	}
	
	public static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	static File src=null;
	
	public static void screenShot() throws IOException
	{
		//Screenshot method
		src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./screenshot/"+"page-"+System.currentTimeMillis()+".png"));
	}

}
