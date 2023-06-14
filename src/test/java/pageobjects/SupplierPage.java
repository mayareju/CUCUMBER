package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierPage {
	
	public WebDriver driver;
	
	public SupplierPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email' and @placeholder=' ']")
	private WebElement username;

	@FindBy(xpath="//input[@name='password' and @placeholder=' ']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	
	
	public void userEmail(String stremail) {
		
		username.sendKeys(stremail);
	}
	public void userPassword(String strpass) {
		
		password.sendKeys(strpass);
	}
	public void clickLogin() {
		login.click();
	}
}
