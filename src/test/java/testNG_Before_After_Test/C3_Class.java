package testNG_Before_After_Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3_Class
{
	@Test
	void pqr()
	{
		System.out.println("this is pqr from c3 ");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite");
	}

}
