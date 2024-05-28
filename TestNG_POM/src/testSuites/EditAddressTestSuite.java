package testSuites;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseTest;
import testScripts.EditAddressTestScript;

public class EditAddressTestSuite extends BaseTest {
	
	
	@Test
	public void tc_1245_editAddressTest()
	{
		Assert.assertTrue(new EditAddressTestScript().performEditAddress(), "Test Case is failed.");
	}
	
	

}
