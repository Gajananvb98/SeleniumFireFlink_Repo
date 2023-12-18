package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		File temp = driver.findElement(By.xpath("//span[text()='Profile']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/image2.png");
		FileHandler.copy(temp, dest);
	}

}
