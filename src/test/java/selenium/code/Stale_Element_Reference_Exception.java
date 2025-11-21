package selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element_Reference_Exception
{

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(5000);
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		Thread.sleep(5000);
		ele1.click();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(5000);
		ele1.click();

	}

}
