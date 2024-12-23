package Demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class firstclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.cssSelector("input[name=username]"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.cssSelector("input[type=password]"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.cssSelector("button[type=submit]"));
		login.click();
		WebElement Admin=driver.findElement(By.xpath(".//span[text()='Admin']"));
		Admin.click();
		WebElement add=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		add.click();
		//WebElement name=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
		//name.sendKeys("Amit");
//		WebElement selectElement=driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
//		Select select=new Select(selectElement);
//		select.selectByVisibleText("Admin");
	    WebElement UserRole=driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input"));
		Actions actions=new Actions(driver);
		actions.click(UserRole).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).release().perform();
//		WebElement ess=driver.findElement(By.xpath(".//div[text()='ESS']"));
//		ess.click(); 
		//WebElement add=driver.findElement(By.cssSelector(".//label[text()='Username']"));
		//username.sendKeys("Amit");
		
	}

}
