package testNG_mycodes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Why_Assertions_01_0309 
{
	
	@Test
   void testTitle()
   {
	   String exp_title = "IRCTC home";
	  
	  // String act_title = "IRCTC home"; //in this case if condition will execute  test passed and also test method will also pass
	   String act_title = "IRCTC home"; //in this case else condition will execute  test fail and also test method will also pass
	   //both the cases test method will pass
	  
	   
	 /*  if(exp_title.equals(act_title))
	   {
		   System.out.println("test passed");
	   }
	   else
	   {
		   System.out.println("test fail");
	   }*/
	   
	   //to overcome above problem we will use assertion 
	   
	  // Assert.assertEquals(exp_title, act_title);
	   
	   //we can also use assertion in conditional statements
	   if(exp_title.equals(act_title))
	   {
		   System.out.println("test passed");
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   System.out.println("test fail");
		   Assert.assertTrue(false);
	   }
   }
   
}
