package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups1
{
	@Test(priority = 1, groups = "Sanity_New")
	public void m1()
	{
		Reporter.log("m1 test case.", true);
	}
	
	@Test(priority = 2,  groups = "Sanity_New")
	public void m2()
	{
		Reporter.log("m2 test case.", true);
	}
	
	@Test(priority = 3, groups = "Regression_New")
	public void m3()
	{
		Reporter.log("m3 test case.", true);
	}
	
	@Test(priority = 4, groups = "Regression_New")
	public void m4()
	{
		Assert.fail();
		Reporter.log("m4 test case.", true);
	}
	

	
}
