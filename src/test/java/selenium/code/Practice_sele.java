package selenium.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_sele 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		Actions Act = new Actions(driver);
	WebElement ele	 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		
		
	}
}
