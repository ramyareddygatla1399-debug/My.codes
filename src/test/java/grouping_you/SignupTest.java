package grouping_you;

import org.testng.annotations.Test;

public class SignupTest
{
	//regression 
	
	@Test(priority=1,groups= {"regression"})
	void signupByEmail()
	{
		System.out.println("signup by email...");
	}
	@Test(priority=2,groups= {"regression"})
	void signupByFacebook()
	{
		System.out.println("signup by Facebook...");
	}
	@Test(priority=3,groups= {"regression"})
	void signupByTwitter()
	{
		System.out.println("signup by Twitter...");
	}

}
