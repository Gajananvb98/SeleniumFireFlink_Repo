package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait dw =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.id("day"));
		Select s =new Select(day);
		s.selectByIndex(2);
		s.deselectByIndex(2);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 =new Select(month);
		s1.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 =new Select(year);
		s2.selectByValue("2019");
		List<WebElement> list = s2.getOptions();		
		s2.selectByIndex(list.size()-1);
	}
}
