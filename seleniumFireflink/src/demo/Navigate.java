package demo;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.shoppersstack.com/");
		// driver.navigate().to("https://www.shoppersstack.com/");
		driver.navigate().to(new URL("https://www.shoppersstack.com/"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
