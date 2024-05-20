package pack1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Assertions
{
	
	@Test
	public void m7()
	{
		Reporter.log("m7 test case.", true);
		
		// hard assert
//		Assert.fail();   // to fail the test case 
		System.out.println("After hard assert.");
	}
	
	@Test
	public void m8()
	{
		Reporter.log("m8 test case.", true);
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Before assertAll");
		
		sa.assertAll();
		System.out.println("After assertAll");
	}
	
	@Test
	public void m9()
	{
		
		boolean result = true;
		String result2 = "abc";
		
		Assert.assertEquals(result2, "abc");
	}
	
	@Test
	public void m10()
	{
		
		boolean result = false;

		Assert.assertTrue(result, "Test case is failed.");
	}
	
	@Test
	public void m11()
	{
		
		boolean result = false;

		Assert.assertFalse(result, "Test case is failed.");
	}
	
	
	@Test
	public void m12()
	{
		
		String result = "abc";

		Assert.assertNotEquals(result, "abc");
	}
	
}
