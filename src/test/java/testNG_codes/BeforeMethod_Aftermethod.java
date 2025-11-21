package testNG_codes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_Aftermethod
{
	@BeforeMethod
	void login()
	{
		System.out.println("This is login....");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is Search....");
	}
	@Test(priority=2)
	void AdvancedSearch()
	{
		System.out.println("This is AdvancedSearch....");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout....");
	}

}
