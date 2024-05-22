package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(pack1.ListenerClass.class)
public class ListenerTest
{
	
	@Test
	public void m1()
	{
		Assert.fail();
		Reporter.log("m1 test case.", true);
	}

}
