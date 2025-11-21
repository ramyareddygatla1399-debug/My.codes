package testNG_codes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_After_Class 
{
	@BeforeClass
	void login()
	{
		System.out.println("login...");
	}
     @Test(priority=1)
	void search()
	{
		System.out.println("this is search");
	}
     @Test(priority=2)
	void Advancedsearch()
	{
		System.out.println("This is advanced search....");
	}
    @AfterClass
	void logout()
	{
		System.out.println("logout...");
	}

}
