package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BookingPage;
import pageobjects.LoginPage;

public class CustomerStep {

	public WebDriver driver;
	
	public LoginPage login;
	
	public BookingPage booking;
	
	@Given("User Launch Edge browser")
	public void user_launch_Edge_browser() {
		driver = new EdgeDriver();
		login = new LoginPage(driver);
		booking = new BookingPage(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) throws InterruptedException {
		
		Thread.sleep(4000);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
		Thread.sleep(4000);
		login.userEmail(email);
		Thread.sleep(4000);
	    login.userPassword(password);
	}

	@When("click login")
	public void click_login() throws InterruptedException {
		Thread.sleep(4000);
	    login.clickLogin();
	}

	@Then("Page url should contain {string}")
	public void page_url_should_contain(String title) throws InterruptedException {
//		String invalidurl = driver.getCurrentUrl();
//		Assert.assertEquals(invalidurl, "https://phptravels.net/login/failed");
//		if(driver.getCurrentUrl().contains(" failed")) {
//	    	//driver.close();
//	    	Assert.assertTrue(true);
//	    }
//		else if(login.getErrorMsg().contains("Please fill out")) {
//			Assert.assertTrue(true);
//		}
		
		if(driver.getCurrentUrl().contains(title)){
			driver.close();
	    	Assert.assertTrue(true);
		}
	    	else if(driver.getCurrentUrl().contains("failed")){
			driver.close();
	    	Assert.assertTrue(true);
		}
		else if(login.getErrorEmailMsg().contains("Please fill out")) {
			driver.close();
			Assert.assertTrue(true);}
		else if(login.getErrorPassMsg().contains("Please fill out")) {
			driver.close();
			Assert.assertTrue(true);}
	   
	    //	Assert.assertEquals(title,driver.getTitle());
	  //  }
}

//	@And("User click on Logout link")
//	public void user_click_on_logout_link() throws InterruptedException {
//	    
//		login.clickLogout();
//		Thread.sleep(4000);
//	}

//	@Then("close browser")
//	public void close_browser() {
//		driver.quit();
//	}
	
	@When("click Login button")
	public void click_login_button() {
	    login.clickLogin();
	}
	@When("user click on My Booking link")
	public void user_click_on_my_booking_link() throws InterruptedException {
		Thread.sleep(4000);
		booking.clickMyBooking();
	}

	@Then("page for booking url should contain {string}")
	public void page_for_booking_url_should_contain(String text) throws InterruptedException {
		Thread.sleep(4000);
		if(driver.getCurrentUrl().contains(text)){
			//driver.close();
	    	Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
	}

//	@Then("user can check the booking by verifying the text")
//	public void user_can_check_the_booking_by_verifying_the_text() throws InterruptedException {
//		Thread.sleep(4000);
//		boolean checkbooking = booking.checkBooking();
//	   Assert.assertTrue(checkbooking);
//	}

	@Then("user can click on view voucher button")
	public void user_can_click_on_view_voucher_button() throws InterruptedException {
		Thread.sleep(5000);
		booking.clickVoucher();
	}
	@Then("page for voucher url should contain {string}")
	public void page_for_voucher_url_should_contain(String text) throws InterruptedException {
		Thread.sleep(4000);
		if(driver.getCurrentUrl().contains(text)){
			//driver.close();
	    	Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(text,driver.getTitle());
	}
//	@And("User click on Logout link")
//	public void user_click_on_logout_link() throws InterruptedException {
//		Thread.sleep(4000);
//		login.clickLogout();
//		
//	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
}
