package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/3");
		String parentID = driver.getWindowHandle();
		
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		windowIds.remove(parentID);
		
		for(String i:windowIds)
		 {
			driver.switchTo().window(i);
			driver.close();
		 }
		driver.switchTo().window(parentID);
		driver.getTitle();
		
	}

}
