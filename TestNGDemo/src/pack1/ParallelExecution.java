package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution
{
	@Test
	public void m1()
	{
		Assert.fail();
		Reporter.log("m1 test case.", true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("m2 test case.", true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("m3 test case.", true);
	}
	
	@Test
	public void m4()
	{
		Reporter.log("m4 test case.", true);
	}
	
	@Test
	public void m6()
	{
		Reporter.log("m6 test case.", true);
	}
	
	@Test
	public void m7()
	{
		Reporter.log("m7 test case.", true);
	}
	
	
	@Test
	public void m8()
	{
		Reporter.log("m8 test case.", true);
	}
	
	@Test
	public void m9()
	{
		Reporter.log("m9 test case.", true);
	}

}
