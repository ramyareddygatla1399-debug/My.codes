package selenium_Codes_01_11_25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1)Launch browser(Chrome)
 * 2) Open URL  https://demo.opencart.com/
 * 3)Validate title should be "Your store"
 * 4) Close browser
 * 
 */
public class FirstTestCase_01 
{  
	public static void main(String[] args) throws InterruptedException
	{
		//1)Launch browser(Chrome)
		WebDriver driver = new ChromeDriver();  
		Thread.sleep(5000);
		//2) Open URL  https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		//3)Validate title should be "Your store"
		String Act_title =  driver.getTitle();
		System.out.println(Act_title);
		/*String exp_Title = "Your Stores";
		
		if(Act_title.equals(exp_Title))
		{
			System.out.println("Test passed..");
		}
		else
		{
			System.out.println("Test failed..");
		}*/
		//4) close browser
		//driver.close();
	}

}
