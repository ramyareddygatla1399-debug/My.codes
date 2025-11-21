package selenium.code;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		WebElement ele  = driver.findElement(By.xpath("//textarea[@name='q']"));
		ele.sendKeys("Hyderabad");
		
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		//int num  = list.size();
		//System.out.println(num);
		
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}*/
		
		for( WebElement  text :list)
		{
			String value = text.getText();
			System.out.println(value);
			
			if(value.contains("hyderabad weather"))
			{
				text.click();
				break;
				
			}
		}

	}

}
