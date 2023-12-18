package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(10000);
		boolean loginButton = driver .findElement(By.xpath("//span[text()='Login']")).isDisplayed();
		System.out.println(loginButton);
	}

}
