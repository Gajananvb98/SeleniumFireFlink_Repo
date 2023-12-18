package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test(groups = "smoke")
	public void launchApple()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
