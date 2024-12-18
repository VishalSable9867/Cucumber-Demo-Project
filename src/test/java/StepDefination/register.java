package StepDefination;

import io.cucumber.java.en.*;

public class register {
	
	@Given("User open the application and navigate to resiter page")
	public void user_open_the_application_and_navigate_to_resiter_page() {
		System.out.println("Hi");
	}

	@When("user click on register button")
	public void user_click_on_register_button() {
		System.out.println("Hi");
	}

	@When("enter the first name (.*)$")
	public void enter_the_first_name(String first) {
		System.out.println("Hi");
	}

	@When("Last name {string}")
	public void last_name(String last) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hi");
	}

	@When("telephone number {string}")
	public void telephone_number(String phone) {
		System.out.println("Hi");
	}

	@When("Email address {string}")
	public void email_address(String email12) {
		System.out.println("Hi");
	}

	@When("enter the password {string}")
	public void enter_the_password(String password11) {
		System.out.println("Hi");
	}

	@When("enter the confirmed password {string}")
	public void enter_the_confirmed_password(String password12) {
		System.out.println("Hi");
	}

	@When("click on check box to confirm the above details")
	public void click_on_check_box_to_confirm_the_above_details() {
		System.out.println("Hi");
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		System.out.println("Hi");
	}

	@Then("system should register the member and account created successfully.")
	public void system_should_register_the_member_and_account_created_successfully() {
		System.out.println("Hi");
	}

	@Then("system should register the member.")
	public void system_should_register_the_member() {
		System.out.println("Hi");
	}

	@When("user click on Yes in newsletter")
	public void user_click_on_yes_in_newsletter() {
		System.out.println("Hi");
	}

	@When("user don't enter any deatils in any field")
	public void user_don_t_enter_any_deatils_in_any_field() {
		System.out.println("Hi");
	}

	@Then("warning message should be displayed.")
	public void warning_message_should_be_displayed() {
		System.out.println("Hi");
	}
	
	@Then("system should display duplicate email address waring message.")
	public void system_should_display_duplicate_email_address_waring_message()
	{
		System.out.println("Hi");
	}
}
