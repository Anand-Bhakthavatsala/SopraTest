package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindows extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		invokeBrowser("firefox");
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?dsh=S1544517355:1708512664006816&flowEntry=SignUp&flowName=GlifWebSignIn&theme=glif&TL=ADg0xR212NeYvJkdFKKQYqMT7DPwPE5IHqq5C_-gY57pT192MoSmdcxzvPVJf_U2");
		//click the Help,T&C
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();//Parent window
		String help = it.next();//Help window - Child
		driver.switchTo().window(help);//child window
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);//parent window
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
	}

}
