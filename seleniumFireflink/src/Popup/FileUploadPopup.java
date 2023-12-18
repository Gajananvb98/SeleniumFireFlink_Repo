package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\Downloads\\invoice-3569.pdf");
		//driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\User\\Downloads\\invoice-3569.pdf");
		
	}

}
