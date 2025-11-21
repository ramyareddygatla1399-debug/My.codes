package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Practice {

	
	WebDriver driver;
	
	@Given("orange application is open")
	public void orange_application_is_open() throws InterruptedException 
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
	}

	@When("enter valid username and password  and click on login")
	public void enter_valid_username_and_password_and_click_on_login() throws InterruptedException 
	{
		  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		  username.sendKeys("ramya");
		  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		  password.sendKeys("admin123");
		  
		  Thread.sleep(5000);
		  
		  WebElement button=driver.findElement(By.xpath("//button[text()=' Login ']"));
		  button.click();
	}

	@Then("close the application")
	public void close_the_application() 
	{
		driver.close();
	  
	}




}
