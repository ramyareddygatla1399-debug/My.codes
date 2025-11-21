package selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 

{
	//constructor
	WebDriver driver;
	Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//identifying locators
	 By username_log = By.xpath("//input[@name='username']");
	 By password_log = By.xpath("//input[@name='password']");
	 By login_log  = By.xpath("//button[@type='submit']");
	 
	 //methods declaring
	 public void username(String username)
	 {
		 driver.findElement(username_log).sendKeys(username);
		// driver.findElement(password_log).sendKeys(password);
	 }
	 public void password(String pass)
	 {
		 driver.findElement(password_log).sendKeys(pass);
	 }
	 public void login()
	 {
		 driver.findElement(login_log).click();
	 }

}
