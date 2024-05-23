package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenerClass.class)
public class ListenerTest
{
	@Test(priority = 1)
	public void m1()
	{
		Reporter.log("m1 test case.", true);
	}
	
//	@Test(priority = 3)
//	public void m2()
//	{
//		Reporter.log("m2 test case.", true);
//		Assert.fail();
//	}
//	
//	@Test(priority = 2, dependsOnMethods = "m2")
//	public void m3()
//	{
//		Reporter.log("m3 test case.", true);
//	}
	
}
