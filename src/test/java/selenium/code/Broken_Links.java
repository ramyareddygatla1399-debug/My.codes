package selenium.code;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 List<WebElement> list = driver.findElements(By.tagName("a"));
		int num = list.size();
		System.out.println(num);
		//System.out.println(list.size());
		
		for(WebElement value :list)
		{
			String text = value.getDomAttribute("href");
			
			if(text==null || text.isEmpty())
			{
				System.out.println("not possible to find broken line");
				continue;
			}
			
		
			
        try {
			URL url = new URL(text);
			HttpURLConnection conn=(HttpURLConnection) 
					url.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(text+"-------------->broken link....");
			}
			else
			{
				System.out.println(text+"----------->not broken link...");
			}
            }
            catch(Exception e)
             {
    	        System.out.println(text+"catch if any..."); 
    	 
              }	
       
		}
		

	}

}
