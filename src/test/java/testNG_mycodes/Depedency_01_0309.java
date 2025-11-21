package testNG_mycodes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depedency_01_0309 
{
	@Test(priority=1)
	void openapp()
	{
		//Assert.assertTrue(false); //case-1
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
		//Assert.assertTrue(false); //case-2
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		//Assert.assertTrue(true); //case 3
		Assert.assertTrue(false);
	}
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advancedSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}

}
