package testNG_Before_After_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1_class
{
	@Test
	void abc()
	{
		System.out.println("This is abc method from C1..");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is BeforeTest method....");
	}

}
