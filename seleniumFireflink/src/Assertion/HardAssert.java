package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.id("Email")).sendKeys("gajananborlepawar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gajanan123@");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		String title = driver.getTitle();
		// if assert equals is passed it will execute below lines else it will print msg
		// from assertEquals method terminate test
		Assert.assertEquals(title, "ShoppersStack | Login", "User failed to login");
		Reporter.log("User logged in successfully", true);
	}
}