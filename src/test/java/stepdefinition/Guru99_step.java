package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Guru99_step 
{
	WebDriver driver;
	
	@Given("registraion page should open")
	public void registraion_page_should_open() 
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	}

	@When("enter user name and password")
	public void enter_user_name_and_password() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("RamyaGatla");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ram@123");
		Thread.sleep(5000);
	
	}

	@When("click on signin")
	public void click_on_signin() 
	{
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() 
	{
		System.out.println("user clicked on sign in button....");

	}

	@Then("clickon registration button")
	public void clickon_registration_button() 
	{
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.navigate().refresh();
		driver.close();
	  
	}

	@Given("registration page should open")
	public void registration_page_should_open() throws InterruptedException
	{
		driver =new ChromeDriver();
		
		//System.out.println("registration page is opened....");
	    driver.get("https://demo.guru99.com/selenium/newtours/");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	}

	@When("enter below details")
	public void enter_below_details(io.cucumber.datatable.DataTable dataTable)
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("firstname");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("address");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("city");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("state");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("postalcode");
	   
	}

	@When("county shoud be selected from dropdown")
	public void county_shoud_be_selected_from_dropdown()
	{
		
		WebElement drop = driver.findElement(By.xpath("//select[@name='country']")); 
		Select s1 = new Select(drop);
		
      // List<WebElement>	list =	s1.getOptions();
      
		s1.selectByValue("INDIA");
	  
	}

	@When("enter username password and confirm password fields")
	public void enter_username_password_and_confirm_password_fields() 
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ram123@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ram@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("ram@123");
	 
	}

	@Then("click on submit")
	public void click_on_submit() 
	{
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	   
	}




}
