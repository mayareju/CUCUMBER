package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement username;

	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//a[@href='https://phptravels.net/account/logout']/i")
	private WebElement logout;
	
	
	
	public void userEmail(String stremail) {
		
		username.sendKeys(stremail);
	}
	public void userPassword(String strpass) {
		
		password.sendKeys(strpass);
	}
	public void clickLogin() {
		login.click();
	}
	public void clickLogout() {
		logout.click();
	}
	
	public String getErrorEmailMsg() {
		String error = username.getAttribute("validationMessage");
		return error;
	}
	public String getErrorPassMsg() {
		String error = password.getAttribute("validationMessage");
		return error;
	}
}
