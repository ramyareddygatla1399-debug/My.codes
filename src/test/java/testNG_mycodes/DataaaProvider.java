package testNG_mycodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataaaProvider 
{
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Test(dataProvider="dp")
	void testlogin(String username,String password)
	{
		//mqnwbe@gmail.com
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  driver.manage().window().maximize();
		  //driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("mqnwbe@gmail.com");
		 // driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
		  driver.findElement(By.xpath("//input[@id='input-email']")).clear();
		  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='input-password']")).clear();
		  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
	     /* boolean status =  driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
	      if(status==true)
	      {
	    	  driver.findElement(By.xpath("//a[text()='Logout'][@class='list-group-item']")).click(); 
	    	  Assert.assertTrue(true);
	      }
	      else
	      {
	    	Assert.fail();  
	      }*/
		
	}
	@AfterClass
	void teardown()
	{
		//driver.quit();
		
	}
	
	@DataProvider(name="dp", indices= {0,1,3})
	Object[][] loginData()
	{
		Object data[][]= { 
				
				{"ram@gmai.com","ram@123"},
				{"sita@gmail.com","suta@123"},
				{"laxman@gmail.com","lax@123"},
				{"hanu@gmail.com","hanu@123"},
				{"sugriv@gmail.com","sug@123"},
				
		};
		return data;
		
	}
	
}
