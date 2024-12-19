package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
       driver.manage().window().maximize();
       //WebElement opennew=driver.findElement(By.xpath("//*[@id=\"a-link-that-opens-a-new-window\"]"));
       //opennew.click();
       System.out.println(driver.getWindowHandles());
       driver.findElement(By.linkText("Open new window")).click();
       System.out.println(driver.getWindowHandles());
       //driver.close();// it close current tab
       driver.quit();// it close the session	
	}

}
