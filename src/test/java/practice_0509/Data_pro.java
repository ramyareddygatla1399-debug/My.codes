package practice_0509;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Data_pro 
{
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "text")
	void login(String user, String pass) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(user);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}
	@AfterClass
	void exit()
	{
		//driver.quit();
	}
	
	@DataProvider(name="text")
	
	Object[][]  enter()
	{
		Object s[][] = {
				{"ram@gmail.com","ram@123"},
				{"sita@gmail.com","sita@123"},
				{"lax@gmail.com","lax@876"},
				{"hanu@gmail.com","hanu@987"},
		};
		return s;
	}

}
