package StepDefination;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class first {
	
	@Before(value="Sanity",order=0)
	public void open_Application()
	{
		System.out.println("OPen the Application");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Close the Application");
	}
	
	@Given("User open the application URL navigate to login Page")
	public void user_open_the_application_url_navigate_to_login_page() {
	 System.out.println("Hi");
	 
	}

	@When("user enters valid Email Address {string}")
	public void user_enters_valid_email_address(String Email) {
		System.out.println("Hi");
	}

	@When("user enter the valid password {string}")
	public void user_enter_the_valid_password(String pass) {
		System.out.println("Hi");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Hi");
	}

	@Then("user is successfully login")
	public void user_is_successfully_login() {
		System.out.println("Hi");
	}

	@When("user enters invalid Email Address {string}")
	public void user_enters_invalid_email_address(String Email1) {
		System.out.println("Hi");
	}

	@When("user enter the invalid password {string}")
	public void user_enter_the_invalid_password(String password1) {
		System.out.println("Hi");
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("Hi");
	}

}
