package object_test_pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import object_login_pack.Object_form_page;
import object_login_pack.Object_login_file;

public class form_test_file {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
driver.manage().window().maximize();	
Object_login_file objlog=new Object_login_file(driver);

Object_form_page objform= new Object_form_page(driver);
objlog.enterUsername("Admin");
objlog.enterpassword("admin123");
objlog.clicklogin(); 
objlog.Admin_text();
objlog.add();
objform.userrole();
objform.status_txt();
objform.username_txt("Amit chaudhary");
objform.employee("m");
objform.password("Amit@123");
objform.Confpass("Amit@123");
objform.save();
	
	
	}

}
