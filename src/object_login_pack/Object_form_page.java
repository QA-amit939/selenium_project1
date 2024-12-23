package object_login_pack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Object_form_page {
	
WebDriver driver;
public Object_form_page(WebDriver driver)
{
this.driver=driver;	
}
By Status=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
private WebElement use;
private WebElement emp;
By Employee=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
By Username=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
By Password=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
By Conformpassword=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
By Submit=By.xpath("//button[@type=\"submit\"]");
public void userrole()
{
WebElement Userrole=driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input"));
Actions actions=new Actions(driver);
actions.click(Userrole).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).release().perform();
}
public void status_txt()
{
this.use=driver .findElement(Status);
Actions actions=new Actions(driver);
actions.click(use).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).click().perform();
}
public void username_txt(String Username1)
{
driver.findElement(Username).sendKeys(Username1);	
}
public void password(String Password1)
{
driver.findElement(Password).sendKeys(Password1);	
}

public void employee(String Emp) throws InterruptedException
{	
	driver.findElement(Employee).sendKeys(Emp);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000), Duration.ofMillis(9000));
	//Wait<WebDriver> next=new FluentWait<>(driver).withTimeout(Duration.ofMillis(200))
			//.pollingEvery(Duration.ofMillis(50)).withMessage("this is not visible")
			//.ignoring(ElementNotInteractableException.class);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='listbox']")));
    System.out.println("now element is visible");
    Thread.sleep(5000);
    for(int i=1;i<=2;i++)
    {
    	driver.findElement((By.xpath("//*[@role='listbox']"))).sendKeys(Keys.ARROW_DOWN);
    	Thread.sleep(2000);
    	Actions actions=new Actions(driver);
    	actions.keyDown(Keys.ARROW_DOWN).click().release().perform();
    	//driver.findElement(Employee).sendKeys(Keys.ENTER);
    }
  //  driver.findElement(Employee).sendKeys(Keys.ARROW_DOWN);
    driver.findElement((By.xpath("//*[@role='listbox']"))).sendKeys(Keys.ENTER);
//this.emp=driver.findElement(Employee);
//Actions actions=new Actions(driver);
//actions.click(emp).sendKeys(Emp).keyDown(Keys.ARROW_DOWN).click().release().perform();
}
public void Confpass(String Conformpass)
{
driver.findElement(Conformpassword).sendKeys(Conformpass);
}
public void save()
{
driver.findElement(Submit).click();	
}
}

