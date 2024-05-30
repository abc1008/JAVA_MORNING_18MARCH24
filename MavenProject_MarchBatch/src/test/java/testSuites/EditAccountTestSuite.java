package testSuites;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import basePack.BaseTest;
import dev.failsafe.internal.util.Assert;
import testScripts.EditAccountTestScript;

//@Listeners(utility.ListenerClass.class)
public class EditAccountTestSuite extends BaseTest
{
	@Test
	public void tc_124_editAccountTest() throws IOException
	{
		org.testng.Assert.assertTrue(new EditAccountTestScript().performEditAccount(), "Test Case is failed.");
	}
	
}
