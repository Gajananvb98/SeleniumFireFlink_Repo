package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.quit();
	}

}
