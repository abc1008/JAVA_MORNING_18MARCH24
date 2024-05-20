package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InclusionExclusion
{
	@Test(priority = 1)
	public void m1()
	{
		Assert.fail();
		Reporter.log("m1 test case.", true);
	}
	
	@Test(priority = 2)
	public void m2()
	{
		Reporter.log("m2 test case.", true);
	}
	
	
	@Test(priority = 3)
	public void m3()
	{
		Reporter.log("m3 test case.", true);
	}
	
	@Test(priority = 4)
	public void m4()
	{
		Reporter.log("m4 test case.", true);
	}

}
