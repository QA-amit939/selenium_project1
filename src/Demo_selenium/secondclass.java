package Demo_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class secondclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.manage().window().maximize();
WebElement username=driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));
WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
username.sendKeys("Admin");
password.sendKeys("admin123");
login.click();
WebElement Admin=driver.findElement(By.xpath("//span[text()='Admin']"));
Admin.click();
WebElement Add=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
Add.click();
WebElement User=driver.findElement(By.xpath("//div[text()='Admin']"));
User.click();
//User.click();
//WebElement Status=driver.findElement(By.xpath("//div[text()='Enabled']"));
//Status.click();
System.out.println("this is testing purpose");
}

}
