package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserttion {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/user-signin");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "ShoppersStack | Login", "failed to navigate");
		Reporter.log("Successfully Navigated", true);
		
		driver.findElement(By.id("Email")).sendKeys("gajananborlepawar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gajanan123@");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		String title = driver.getTitle();
		softAssert.assertEquals(title, "ShoppersStack | Login", "Failed to login");
		Reporter.log("Successfully logged in", true);
		softAssert.assertAll();
		
		
	}
}
