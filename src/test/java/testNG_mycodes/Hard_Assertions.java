package testNG_mycodes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions
{
	@Test
	void test()
	{
		//assertEquals methods
		
		//Assert.assertEquals("xyz", "xyz"); // passed
		//Assert.assertEquals("xyz", "xyz1"); //Failed
		//Assert.assertEquals(123, 345); //Failed
		//Assert.assertEquals(123, "xyz"); //Failed
		//Assert.assertEquals(123, "123"); //Failed
		
		//assertNotEquals method
		
		//Assert.assertNotEquals(123, 123); //false
		//Assert.assertNotEquals(123, 456); //Passed
		
		//assertTrue  method
		
		//Assert.assertTrue(true); //pass
		//Assert.assertTrue(false); //failed
		//Assert.assertTrue(1==2); //false
		//Assert.assertTrue(1==1); //pass
		
		//assert.False method
		
		//Assert.assertFalse(1==1); //fail
		//Assert.assertFalse(1==2); //passed
		//Assert.assertFalse(false); //passed
		//Assert.assertFalse(true); //fail
		
		Assert.fail();
		
	}

}
