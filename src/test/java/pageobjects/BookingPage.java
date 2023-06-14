package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	public WebDriver driver;
	
	public BookingPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://phptravels.net/account/bookings']/i")
	private WebElement booking;
	
	@FindBy(xpath="//a[text()=' View Voucher']")
	private WebElement voucher;
	
	@FindBy(xpath="//th[text()='Status']")
	private WebElement status;
	
	public void clickMyBooking() {
		booking.click();
	}
	
	public void clickVoucher() {
		voucher.click();
	}
	
//	public boolean checkBooking() {
//		boolean text = status.isDisplayed();
//		return text;
//	}
}
