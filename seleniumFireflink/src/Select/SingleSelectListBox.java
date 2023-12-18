package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleSelectListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		
		WebDriverWait dw =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/notebooks?pagesize=4");
		WebElement page = driver.findElement(By.id("products-pagesize"));
		Select s =new Select(page);
		s.selectByVisibleText("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 =new Select(month);
		s1.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 =new Select(year);
		s2.selectByValue("2019");
	}
}