package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();

		Set<String> windowIds = driver.getWindowHandles();

		for (String i : windowIds) {
			System.out.println(i);
		}
	}
}