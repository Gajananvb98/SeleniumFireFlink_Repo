package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleSelectListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait dw =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement listBox = driver.findElement(By.id("cars"));
		Select s = new Select(listBox);
		s.selectByIndex(1);
		s.selectByValue("99");
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
	}
}