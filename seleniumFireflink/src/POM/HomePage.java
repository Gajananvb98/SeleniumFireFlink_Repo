package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class=\"MuiAvatar-img css-1hy9t21\"]")
	private WebElement accountSettingButon;
	
	@FindBy(xpath="//li[text()=\"Logout\"]")
	private WebElement logoutButton;

	public WebElement getAccountSettingButon() {
		return accountSettingButon;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
}
