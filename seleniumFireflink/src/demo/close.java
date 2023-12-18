package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.close();

	}

}
