package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@DataProvider
	public String[][] dataSender()
	{
		String[][] data = {{"borlepawar4@gmail.com", "Gaju123@"},{"gajananborlepawar123@gmail.com", "Gajanan123@"}};
		return data;
	}
	
	@Test(dataProvider = "dataSender")
	public void login(String[] cred)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
}
