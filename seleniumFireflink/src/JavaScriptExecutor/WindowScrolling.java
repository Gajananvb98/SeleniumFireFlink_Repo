package JavaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[text()='Swagger documentation']")).click();

	}

}
