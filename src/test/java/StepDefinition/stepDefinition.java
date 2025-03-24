package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageFactory.Login_Guru99page;
import PageFactory.New_CustomerCreationPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends BaseClass 
{
	WebDriver driver=BaseClass.initializeDriver();
	Login_Guru99page obj = new Login_Guru99page(driver);
	New_CustomerCreationPage obj1=new New_CustomerCreationPage(driver);
			
	
	@Given("User opens the demo application of guru99")
	public void user_opens_the_demo_application_of_guru99() {
	    
		System.out.println("Application Launched");
		
	}

	@Given("the User will enter his username in username field as {string}")
	public void the_user_will_enter_his_username_in_username_field_as(String username) {
		obj.enterUsername(username);
	}

	@Given("the User will ente his password in password field as {string}")
	public void the_user_will_ente_his_password_in_password_field_as(String password) {
		obj.enterPassword(password);
	}

	@When("user will click on the login button of the application after the fields")
	public void user_will_click_on_the_login_button_of_the_application_after_the_fields() {
		obj.clickonLogin();
	}

	@Then("user will be navigated to the demo application of guru99")
	public void user_will_be_navigated_to_the_demo_application_of_guru99() {
		System.out.println(gettitle());
	}
	
	@Given("the user clicks on the new customer link in the application guru99")
	public void the_user_clicks_on_the_new_customer_link_in_the_application_guru99() {
	    obj1.clickonNewCustomerLink();
	}

	@Given("user enters the customer name in guru99 application as {string}")
	public void user_enters_the_customer_name_in_guru99_application_as(String customer_name) {
		obj1.enterCustomerName(customer_name);
	}

	@Given("user selects the gender in the page")
	public void user_selects_the_gender_in_the_page() {
		obj1.selectGender();
	}

	@Given("user enters the address in guru99 application as {string}")
	public void user_enters_the_address_in_guru99_application_as(String address) {
		obj1.enterAddress(address);
	}

}
