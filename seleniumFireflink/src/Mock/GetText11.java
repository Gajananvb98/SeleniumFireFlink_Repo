package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Books']"));
		System.out.println(ele.getText());
	}
}
