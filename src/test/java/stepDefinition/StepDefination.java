package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver = new ChromeDriver();

	@Given( "User is on Login page" )
	public void user_is_on_login_page() {
	   driver.get("https://www.instagram.com/accounts/login/");
	}

	@When( "User enter valid mail id and password" )
	public void user_enter_valid_mail_id_and_password() {
	   System.out.println("UserName and password");
	    
	}

	@And( "User click on continue button" )
	public void user_click_on_continue_button() {
	   System.out.println("Button");
	}
	  

	@Then( "User enter in to Home page of Gmail" )
	public void user_enter_in_to_home_page_of_gmail() {
	    System.out.println("User enter in to Home page of Gmail");
	    driver.close();
	}
	


}
