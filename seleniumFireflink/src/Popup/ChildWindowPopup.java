package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.shoppersstack.com/products_page/3");
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
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size.getHeight());
		 System.out.println(size.getWidth());
		 driver.close();
	}

}
