package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.shoppersstack.com/"))
		{
			System.out.println("User navigated");
		}
		else
			System.out.println("User failed ");
	}

}
