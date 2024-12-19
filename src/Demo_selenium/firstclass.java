package Demo_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement text =driver.findElement(By.cssSelector("#my-text-id"));
		WebElement password=driver.findElement(By.cssSelector("input[name=my-password]"));
        WebElement textarea=driver.findElement(By.cssSelector("textarea.form-control"));
        WebElement selectElement=driver.findElement(By.name("my-select"));
        Select select=new Select(selectElement);
        select.selectByValue("2");
        //WebElement Dropdown=driver.findElement(By.name("my-select"));
        
        WebElement Dropdowndata=driver.findElement(By.cssSelector("input[name=my-datalist]"));
        WebElement fileinput=driver.findElement(By.cssSelector("input[name=my-file]"));
        WebElement checkbox=driver.findElement(By.cssSelector("input#my-check-1"));
        WebElement checkradio=driver.findElement(By.cssSelector("input#my-radio-1"));
        WebElement checkradio2=driver.findElement(By.id("my-radio-2"));
        if(checkradio.isSelected())
        {
        checkradio2.click();
        }
        else
        {
        	checkradio.click();
        }
        WebElement color=driver.findElement(By.name("my-colors"));
        WebElement date=driver.findElement(By.name("my-date"));
        WebElement submit=driver.findElement(By.cssSelector("body > main > div > form > div > div:nth-child(2) > button"));
        text.sendKeys("amit.1@gmail.com");
        password.sendKeys("amit@123");
        textarea.sendKeys("Hello, this is first page");
       // Dropdown.sendKeys("one");
        Dropdowndata.sendKeys("New Yark");
        fileinput.sendKeys("C:\\Users\\Admin\\Pictures\\Camera Roll");
        checkbox.click();
       // checkradio.click();
        color.sendKeys("#563d7c");
        date.sendKeys("12/15/2024");
        submit.click();

	}

}
