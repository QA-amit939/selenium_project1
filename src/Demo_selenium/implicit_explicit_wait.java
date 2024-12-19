package Demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class implicit_explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
        //WebElement reveal=driver.findElement(By.id("reveal"));
        WebElement reveal=driver.findElement(By.xpath("//input[@id=\"reveal\"]"));
		reveal.click();
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000), Duration.ofMillis(500));
		Wait<WebDriver> next=new FluentWait<>(driver).withTimeout(Duration.ofMillis(200))
				.pollingEvery(Duration.ofMillis(50)).withMessage("this is not visible")
				.ignoring(ElementNotInteractableException.class);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reveal")));
	    WebElement fill=driver.findElement(By.id("revealed"));
	    fill.sendKeys("Amit");
	
	}

}
