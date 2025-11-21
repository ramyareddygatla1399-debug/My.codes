package grouping_you;

import org.testng.annotations.Test;

public class PaymentTest 
{
	//sanity and regression (regression)
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentInRupees()
	{
		System.out.println("payment in rupees");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentInDollers()
	{
		System.out.println("payment in Dollers");
	}
	

}
