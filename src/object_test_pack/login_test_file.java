package object_test_pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import object_login_pack.Object_login_file;

public class login_test_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
Object_login_file objlog=new Object_login_file(driver);
objlog.enterUsername("Admin");
objlog.enterpassword("admin123");
objlog.clicklogin(); 
objlog.Admin_text();
objlog.add();
objlog.userrole();
objlog.Status();
objlog.employee("jash sharma");

//objlog.password("amit@123");


	}

}
