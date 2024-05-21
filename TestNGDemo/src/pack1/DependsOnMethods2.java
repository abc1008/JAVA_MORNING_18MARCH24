package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods2
{
	@Test(priority = 1)
	public void m5()
	{
		Reporter.log("m1 test case.", true);
	}
	
	@Test(priority = 2)
	public void m6()
	{
//		Assert.fail();
		Reporter.log("m2 test case.", true);
	}
	
	@Test(priority = 3, dependsOnMethods = { "m6","pack1.DependsOnMethodsKeyword.m3" })
	public void m7()
	{
		Reporter.log("m3 test case.", true);
	}
	
	@Test(priority = 4)
	public void m8()
	{
		Reporter.log("m4 test case.", true);
	}

}
