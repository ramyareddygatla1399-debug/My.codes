package testNG_class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depedency_02 

{
	@Test(priority=1)
	void open()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"open"})
	void login()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=3)
	void search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4)
	void advancedsearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5)
	void logout()
	{
		Assert.assertTrue(true);
	}

	
	
	

}
