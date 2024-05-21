package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameters
{

	@Test(priority = 1)
	@org.testng.annotations.Parameters({"BrowserType", "BuildVersion"})
	public void m1(String argument1, String argument2)
	{
		Reporter.log("m1 test case.", true);
		System.out.println("m1 test case : "+ argument1);
		System.out.println("m1 test case : "+ argument2);
	}
	
	@Test(priority = 2)
	@org.testng.annotations.Parameters({"BrowserType", "BuildVersion"})
	public void m2(String aa1, String aa2)
	{
		Reporter.log("m1 test case.", true);
		System.out.println("m1 test case : "+ aa1);
		System.out.println("m1 test case : "+ aa2);
	}
	
	
}
