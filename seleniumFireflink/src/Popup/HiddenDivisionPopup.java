package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		WebElement overlayFrame = driver.findElement(By.xpath("//iframe[@name=\"notification-frame-317738b3\"]"));
		driver.switchTo().frame(overlayFrame);
		driver.findElement(By.xpath("//a[@class=\"close\"]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true)
		{
			try {
				driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='10']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			}
		}
	}
}
