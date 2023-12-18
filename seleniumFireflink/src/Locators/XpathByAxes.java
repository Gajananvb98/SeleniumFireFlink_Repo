package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(10000);
		driver.findElement(By.id("Email")).sendKeys("gajananborlepawar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gajanan123@");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@class=\"MuiAvatar-img css-1hy9t21\"]")).click();
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//li[text()='Wish List']/following-sibling::li")).getText();
		System.out.println(name);
		
	}

}
