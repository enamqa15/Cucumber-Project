package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class StepDefinitions2 {
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		System.out.println("User is on Home Page");
	   
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
	   System.out.println("User Navigate to LogIn Page");
	}

	@And("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
	  System.out.println("User enters UserName and Password");
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
	  System.out.println("Message displayed Login Successfully");
	}

}
