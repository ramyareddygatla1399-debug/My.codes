package testNG_17oct;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_practice 
{
	@BeforeMethod
	void login()
	{
		
	}
	@Test(priority=1)
	void search()
	{
		
	}
	@Test(priority=2)
	void advsearch()
	{
		
	}
	@AfterMethod
	void logout()
	{
		
	}

}
