package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/user-signin");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("Gaju");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		email.sendKeys("Gajanan");
		/*
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("123456");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.getEmailTextField().sendKeys("98765");
		*/
	}

}
