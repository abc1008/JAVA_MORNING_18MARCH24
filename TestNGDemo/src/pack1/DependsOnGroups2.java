package pack1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups2
{
		@Test(priority = 1, groups = "Sanity")
		public void m5()
		{
			Reporter.log("m1 test case.", true);
		}

		@Test(priority = 2, groups = "Regression")
		public void m6()
		{
			Reporter.log("m2 test case.", true);
		}

		@Test(priority = 3, groups = "Group3")
		public void m7()
		{
			Reporter.log("m3 test case.", true);
		}

		@Test(priority = 4)
		public void m8()
		{
			Reporter.log("m4 test case.", true);
		}
		
		@Test(priority = 5, dependsOnGroups = {"Sanity", "Regression" })
		public void m10()
		{
			Reporter.log("m10 test case.", true);
		}
	
}
