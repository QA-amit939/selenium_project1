package object_login_pack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Object_login_file {
	WebDriver driver;
	public Object_login_file(WebDriver driver)
	{
		this.driver=driver;
	}
	
By username=By.xpath("//input[@name=\"username\"]");
By password=By.xpath("//input[@name=\"password\"]");
By login=By.xpath("//button[@type=\"submit\"]");
By Admin=By.xpath("//span[text()='Admin']");
By Add=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
By Password=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
//By Employeename=By.xpath("//input[@placeholder=\"Type for hints...\"]");
public void enterUsername(String Username)
{
driver.findElement(username).sendKeys(Username);
}
public void enterpassword(String Password)
{
driver.findElement(password).sendKeys(Password);
}
public void clicklogin()
{
driver.findElement(login).click();
}
public void Admin_text()
{
driver.findElement(Admin).click();	
}
public void add()
{
driver.findElement(Add).click();	
}
public void userrole()
{
WebElement Userrole=driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input"));
Actions actions=new Actions(driver);
actions.click(Userrole).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).release().perform();
}
public void Status()
{
WebElement status=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));	
Actions actions=new Actions(driver);
actions.click(status).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).release().perform();
}
public void employee(String employee)
{
	
WebElement Employee=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));	
	
Actions action=new Actions(driver);

action.click(Employee).sendKeys(employee).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).click().perform();
}



public void password(String password)
{
	driver.findElement(Password).sendKeys(password);
}

}
