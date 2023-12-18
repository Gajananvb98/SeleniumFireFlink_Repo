package POM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/user-signin");
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("gajananborlepawar123@gmail.com");
		lp.getPasswordTextField().sendKeys("Gajanan123@");
		lp.getLoginButton().click();
		
		HomePage hp = new HomePage(driver);
		hp.getAccountSettingButon().click();
		hp.getLogoutButton().click();
		
	}

}
