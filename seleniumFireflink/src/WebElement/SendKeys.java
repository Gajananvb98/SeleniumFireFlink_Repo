package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(10000);
		driver.findElement(By.id("Email")).sendKeys("gajananborlepawar123@gmail.com");
		WebElement click = driver.findElement(By.id("Password"));
		click.sendKeys("Gajanan123@", Keys.ENTER);
	}
}
