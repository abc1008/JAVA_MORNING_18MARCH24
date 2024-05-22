package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution2
{
	@Test
	public void m10()
	{
		Assert.fail();
		Reporter.log("m10 test case.", true);
	}
	
	@Test
	public void m11()
	{
		Reporter.log("m11 test case.", true);
	}
	
	@Test
	public void m12()
	{
		Reporter.log("m12 test case.", true);
	}
	
	@Test
	public void m13()
	{
		Reporter.log("m13 test case.", true);
	}
	
	@Test
	public void m14()
	{
		Reporter.log("m14 test case.", true);
	}
	
	@Test
	public void m15()
	{
		Reporter.log("m15 test case.", true);
	}

}
