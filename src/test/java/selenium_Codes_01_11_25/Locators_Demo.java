package selenium_Codes_01_11_25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("iphone");
		
		//id 
		boolean logo = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo);
		
		//linktxt //complete text we need to send
		driver.findElement(By.linkText("Desktops")).click();
		
		//partial linktext //some part of the text we need to send 
		driver.findElement(By.partialLinkText("Desk")).click();
		
		//classname - is used when we want to get multiple web elements or group of web elements
		
		List<WebElement> headrerlink = driver.findElements(By.className("list-inline-item"));
	 System.out.println("Total number of header links: "+headrerlink.size());
	 
	 //tagname
	 
	 List<WebElement> tags=  driver.findElements(By.tagName("a"));
	 System.out.println("total number of links: "+tags.size());
		 
	}

}
