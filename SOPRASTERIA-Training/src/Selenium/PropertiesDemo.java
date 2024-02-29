package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class PropertiesDemo extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\SOPRASTERIA-Training\\src\\Selenium\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);//it is pointing to data.properties file
		String name=prop.getProperty("usrname");
		System.out.println(name);
		System.out.println(prop.getProperty("pwd"));
		System.out.println(prop.getProperty("browser"));
	}
}

