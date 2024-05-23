package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenerClass.class)
public class ListenerTest2
{
	@Test(priority = 1)
	public void m4()
	{
		Reporter.log("m4 test case.", true);
	}
	
	@Test(priority = 5)
	public void m5()
	{
		Reporter.log("m5 test case.", true);
		Assert.fail();
	}
	
	@Test(priority = 6, dependsOnMethods = "m5")
	public void m6()
	{
		Reporter.log("m6 test case.", true);
	}
	
}
