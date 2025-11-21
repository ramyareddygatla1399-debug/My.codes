package selenium.code;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;

public class Codes 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		WebElement screen = driver.findElement(By.xpath("//a[@role='button']"));
		
		//TakesScreenshot ts =   (TakesScreenshot)driver;
	
		//File temp =    screen.getScreenshotAs(OutType.FILE);
		
		
	}

	

}
