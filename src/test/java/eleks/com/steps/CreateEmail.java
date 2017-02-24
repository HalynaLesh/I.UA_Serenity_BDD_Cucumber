package eleks.com.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eleks.com.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class CreateEmail {
	
	@Steps
	EndUserSteps endUser;

	@And("^I navigate to Create Email page$")
	public void navigateToCreateEmailPage () {
		endUser.navigateToCreateEmailPage();
	}

	@Then("^I should be able to create Email$")
	public void isOnCreateEmailPageOpened() {
		endUser.isOnCreateEmailPage();
	}

	@And("^I create Email$")
	public void createEmail() {
		endUser.createEmail();
	}

	@Then("^I should navigate to Success Send Mail Page$")
	public void isSuccessSendMailPageOpened() {
		endUser.isSuccessSendMailPageOpened();
	}
	
	@When("^I navigate to Sent Email Page$")
	public void navigateToSentEmailPage(){
		endUser.navigateToSentEmailPage();
	}
	
	@Then("^I should be see my sent Email with correct body$")
	public void positiveVerifyEmailSubject(){
		endUser.positiveVerifyEmailSubject();
	}
	
	@Then("^I should be see my sent Email with incorrect body$")
	public void negativeVerifyEmailSubject(){
		endUser.negativeVerifyEmailSubject();
	}
	
	@And("^Open sent Email$")
	public void openSentEmail(){
		endUser.openSentEmail();
	}
	
	@Then("^I should see correct email contains$")
	public void positiveIsCorrectEmailContains(){
		endUser.positiveIsCorrectEmailContains();
	}
	
	@Then("^I should see incorrect email contains$")
	public void negativeIsCorrectEmailContains(){
		endUser.negativeIsCorrectEmailContains();
	}
}
