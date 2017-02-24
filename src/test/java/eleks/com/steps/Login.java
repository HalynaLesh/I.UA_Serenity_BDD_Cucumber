package eleks.com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eleks.com.steps.serenity.EndUserSteps;


public class Login {
	
	@Steps
	EndUserSteps endUser;
	
	@Given("^I navigate to Main Page$")
	public void navigateToMainPage() {
		endUser.navigateToMainPage();
	}

	@Then("^I should be able to login$")
	public void isOnMaiPageOpened() {
		endUser.isOnMaiPageOpened();
	}

	@When("^I login with correct credentials$")
	public void positiveLoginAs() {
		endUser.positiveLoginAs();
	}
	
	@When("^I login with incorrect credentials$")
	public void negativeLoginAs() {
		endUser.negativeLoginAs();
	}

	@Then("^I should be redirected to MailBox Page$")
	public void isOnMailBoxPageOpened() {
		endUser.isOnMailBoxPageOpened();
	}

}
