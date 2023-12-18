package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(invocationCount = 1, threadPoolSize   = 2)
	public void sample()
	{
		WebDriver drier = new ChromeDriver();
		drier.get("https://www.shoppersstack.com/");
		Reporter.log("Test NG class Executed", true);
	}
	
	@Test(enabled = false)
	public void register()
	{
		Reporter.log("User registered successfully", true);
	}
	
}
