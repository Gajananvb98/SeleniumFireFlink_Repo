package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoLogin {
	
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.id("Email")).sendKeys("gajananborlepawar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gajanan123@");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		if(driver.getTitle().equals("ShoppersStack | Home"))
		{
			Reporter.log("User logged in successfully", true);
		}
		else
		{
			Reporter.log("User failed to login", true);
		}
		//In this case when will run the suite it will pass the suite whether user is failed to login
		
	}
}
