package selenium.code;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Page_class 
{
	WebDriver driver;
	
	@BeforeClass
	
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		Thread.sleep(5000);	
	}
	
	@Test
	public void loginnn() throws InterruptedException
	{
		Loginpage test = new Loginpage(driver);
		
		Thread.sleep(5000);
		
		//username= "Admin";
		test.username("Admin");
		Thread.sleep(5000);
		test.password("admin123");
		Thread.sleep(5000);
		test.login();
	}
	
	@AfterClass
	public void logout()
	{
		//driver.quit();
	}

}
