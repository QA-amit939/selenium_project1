package Demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_Demo {
	WebDriver driver;
	void StartBrowser()
	{
		  driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		driver.manage().window().maximize();
	}
	
	void drag_drop()
	{
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement dropable=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(draggable, dropable).perform();
		//action.dragAndDropBy(dropable, 75, 308).perform();
		
		
	}
	
	void clickable()
	{
		
		WebElement clickable= driver.findElement(By.id("clickable"));
	Actions actions=new Actions(driver);
		actions.clickAndHold(clickable).sendKeys("aaa").keyDown(Keys.SHIFT).sendKeys("aaa").keyUp(Keys.SHIFT)
		.sendKeys("bbb").release().perform();
        
	}
	void hoverable()
	{
		Actions action=new Actions(driver);
		WebElement hover=driver.findElement(By.id("hover"));
		action.pause(Duration.ofMillis(5000)).moveToElement(hover).perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
//		driver.manage().window().maximize();
//		WebElement clickable= driver.findElement(By.id("clickable"));
//		Actions actions=new Actions(driver);
//		actions.clickAndHold(clickable).sendKeys("aaa").keyDown(Keys.SHIFT).sendKeys("aaa").keyUp(Keys.SHIFT)
//		.sendKeys("bbb").release().perform();
		Mouse_Action_Demo obj=new Mouse_Action_Demo();
		obj.StartBrowser();
        obj.clickable();
        obj.drag_drop();
        obj.hoverable();
	}

}