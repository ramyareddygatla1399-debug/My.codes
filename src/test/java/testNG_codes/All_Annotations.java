package testNG_codes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations
{  
	//SUITE LEVEL 
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("This is before suite...");
	}
   @AfterSuite
	void aftersuite()
	{
		System.out.println("This is after suite...");
	}
   //TEST LEVEL 
	@BeforeTest
	void beforetest()
	{
		System.out.println("This is  before test...");
	}
	@AfterTest
	void aftertest()
	{
		System.out.println("This is after test...");
	}
	
	//CLASS LEVEL 
	@BeforeClass
	void beforeclass()
	{
		System.out.println("This is before class...");
	}
	@AfterClass
	void afterclass()
	{
		System.out.println("This is after class...");
	}
	//METHOD LEVEL 
	@BeforeMethod
	void beforemethod()
	{
		System.out.println("This is before method...");
	}
	@AfterMethod
	void aftermethod()
	{
		System.out.println("This is after method...");
	}
	
	@Test(priority=1)
	void testmethod1()
	{
		System.out.println("this is test method 1.....");
	}
	@Test(priority=2)
	void testmethod2()
	{
		System.out.println("this is test method 2.....");
	}

}
