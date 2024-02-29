package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("firefox");
		driver.navigate().to("https://demoqa.com/droppable/");
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		//drag and drop -> Actions class
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		String value=target.getText();		
		if(value.equals("Dropped!"))
		{
			System.out.println(value+" Dropped successfully!");
		}
		else
			System.out.println("Did not perform drop");
		
		//move to an element
		driver.navigate().to("https://demoqa.com/menu/");
		act.moveToElement(target).perform();
		
		
		closeBrowser();
	}

}
