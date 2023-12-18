package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		Thread.sleep(4000);
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
		System.out.println(alt.getText());
		
	}

}
