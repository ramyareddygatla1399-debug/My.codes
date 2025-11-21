package testNG_mycodes;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_VS_soft_Assertions
{
	/*
	@Test
	void hard_Assertion()
	{
		//hard assertion
		System.out.println("statement-1...");
		System.out.println("statement-2...");
		
		//Assert.assertEquals(1, 1); //if assertion is passed all statements will execute and test pass 
		//Assert.assertEquals(1, 2); //if assertion is failed  rest of the statements will not execute and test failed
		
		System.out.println("statement-3...");
		System.out.println("statement-4...");
		//to avoid above issue keep assertion at end  so that all statements will execute
		Assert.assertEquals(1, 2);
		
	}   
	*/
	@Test
	void Soft_Assertion()
	{
	   //By  using soft assertion, if the assertion got failed still we can execute rest of the statements in test method
		System.out.println("statement-1...");
		System.out.println("statement-2...");
		
		//soft assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1,2);  
		
		System.out.println("statement-3...");
		System.out.println("statement-4...");
		
		sa.assertAll();//mandatory
		
	}  
	
	

}
