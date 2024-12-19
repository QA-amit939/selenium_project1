package Demo_selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new EdgeDriver();
 driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
 driver.manage().window().maximize();
 WebElement aler=driver.findElement(By.linkText("See an example alert"));
 Actions action=new Actions(driver);
 action.scrollToElement(aler).click(aler).perform();
 Alert alt=driver.switchTo().alert();
Thread.sleep(5000);
 alt.accept();

// WebElement alert0=driver.findElement(By.linkText("See an example alert"));
// Actions action=new Actions(driver);
// action.scrollToElement(alert0).click(alert0).perform();
// Alert alt=driver.switchTo().alert();
// alert0.click();
 
 WebElement alert2=driver.findElement(By.linkText("See a sample confirm"));
 
 int X =alert2.getRect().getX();	
 int Y = alert2.getRect().getY();
 System.out.println("this is axis :" + X + " " + Y);
//alert2.click();
 // driver.findElement(By.name("see a sample confirm"));
 Actions action1=new Actions(driver);
 action1.scrollByAmount(944, 1000).click(alert2).perform();
 //action1.scrollToElement(alert2).click(alert2).perform();
 Alert alert1=driver.switchTo().alert();
 Thread.sleep(5000);
alert1.dismiss();
 //alert2.click();
 WebElement alert3=driver.findElement(By.linkText("See a sample prompt"));
 int x=alert3.getRect().getX();
 int y=alert3.getRect().getY();
 System.out.println("this is axis:" + X+" "+Y);
 Actions action4=new Actions(driver);
action4.scrollByAmount(944, 3000).click(alert3).perform();
 Alert alert4=driver.switchTo().alert();
 Thread.sleep(5000);
 alert4.accept();
////// alert3.click();
 
 

	}

}
