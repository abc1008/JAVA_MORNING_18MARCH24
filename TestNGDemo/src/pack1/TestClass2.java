package pack1;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TestClass2
{
	@Test(priority = 5)
	public void m5()
	{
		Reporter.log("m5 test case.", true);
	}
	
	@Test(priority = 6)
	public void m6()
	{
		Reporter.log("m6 test case.", true);
	}
	
	@BeforeClass   // first in entire class
	public void BeforeClass2()
	{
		System.out.println("BeforeClass2 test case.");
	}
	
	@AfterClass  // last in entire class
	public void AfterClass2()
	{
		System.out.println("AfterClass2 test case.");
	}
	
	@BeforeMethod
	public void BeforeMethod2()
	{
		System.out.println("BeforeMethod2 test case.");
	}
	
	@AfterMethod 
	public void AfterMethod2()
	{
		System.out.println("AfterMethod2 test case.");
	}


	
}
