package pack1;

import org.testng.Reporter;
import org.testng.annotations.*;

@Listeners(pack1.ListenerClass.class)
public class AnnotationsAndListeners
{
	@Test(priority = -5)
	public void m1()
	{
		Reporter.log("m1 test case.", true);
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod test case.");
	}
	
	@AfterMethod 
	public void AfterMethod()
	{
		System.out.println("AfterMethod test case.");
	}
	
	@BeforeClass   // first in entire class
	public void BeforeClass()
	{
		System.out.println("BeforeClass test case.");
	}
	
	@AfterClass  // last in entire class
	public void AfterClass()
	{
		System.out.println("AfterClass test case.");
	}

	@BeforeTest
	public void BeforeTest1()
	{
		System.out.println("BeforeTest1 test case.");
	}
	
	@AfterTest
	public void AfterTest1()
	{
		System.out.println("AfterTest1 test case.");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite test case.");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite test case.");
	}
}
