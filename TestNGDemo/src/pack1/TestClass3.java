package pack1;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TestClass3
{
	@Test(priority = 7)
	public void m7()
	{
		Reporter.log("m7 test case.", true);
	}
	
	@Test(priority = 8)
	public void m8()
	{
		Reporter.log("m8 test case.", true);
	}
	
	@BeforeClass   // first in entire class
	public void BeforeClass3()
	{
		System.out.println("BeforeClass3 test case.");
	}
	
	@AfterClass  // last in entire class
	public void AfterClass3()
	{
		System.out.println("AfterClass3 test case.");
	}
	
	@BeforeMethod
	public void BeforeMethod3()
	{
		System.out.println("BeforeMethod3 test case.");
	}
	
	@AfterMethod 
	public void AfterMethod3()
	{
		System.out.println("AfterMethod2 test case.");
	}

	@BeforeTest
	public void BeforeTest2()
	{
		System.out.println("BeforeTest2 test case.");
	}
	
	@AfterTest
	public void AfterTest2()
	{
		System.out.println("AfterTest2 test case.");
	}
	
}
