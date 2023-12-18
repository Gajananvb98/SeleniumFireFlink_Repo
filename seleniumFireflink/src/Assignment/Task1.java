package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait dw =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/fantasy-football");
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		driver.findElement(By.id("regUser")).click();
	}

}
