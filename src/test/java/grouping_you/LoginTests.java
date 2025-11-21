package grouping_you;

import org.testng.annotations.Test;

public class LoginTests

{
	//login sanity testcases 
	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("login by email...");
	}
   @Test(priority=2,groups= {"sanity"})
     void loginByFacebook()
   {
	System.out.println("login by Facebook...");
    }

    @Test(priority=3,groups= {"sanity"})
    void loginByTwitter()
    {
	System.out.println("login by Twitter...");
   }

}
