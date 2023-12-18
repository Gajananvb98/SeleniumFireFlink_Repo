package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		//Thread.sleep(4000);
		WebElement image = driver.findElement(By.id("drag1"));
		WebElement dest = driver.findElement(By.id("div2"));
		Actions act = new Actions(driver);
		act.dragAndDrop(image, dest).perform();
		
	}

}
