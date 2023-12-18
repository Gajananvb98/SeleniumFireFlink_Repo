package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {

	@Test(dependsOnMethods = "register")
	public void sample()
	{
		Reporter.log("Test NG class Executed", true);
	}
	
	@Test(priority = -1)
	public void register()
	{
		Reporter.log("User registered successfully", true);
		Assert.fail();
	}

}
