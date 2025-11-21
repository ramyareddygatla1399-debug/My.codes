package testNG_Before_After_Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2_class 
{
	@Test
	void xyz()
	{
		System.out.println("this is xyz from C2....");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is aftertest method...");
	}

}
