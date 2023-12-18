package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		
		 Set<String> windowIds = driver.getWindowHandles();
		 
		 for(String i:windowIds)
		 {
			 driver.switchTo().window(i);			 
			 if(driver.getCurrentUrl().contains("ebay"))
			 {
				 System.out.println(i);
				 break;
			 }
		 }
		 driver.manage().window().maximize();
	}
}
