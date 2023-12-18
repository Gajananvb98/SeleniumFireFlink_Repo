package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("ShoppersStack | Login"))
		{
			System.out.println("User navigated");
		}
		else
			System.out.println("User failed to navigate");
	}

}
