package eleks.com.steps.serenity;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import eleks.com.emailbuilder.Email;
import eleks.com.emailbuilder.EmailBuilder;
import eleks.com.pages.CreateMailPage;
import eleks.com.pages.MailBoxPage;
import eleks.com.pages.MainPage;
import eleks.com.pages.SentEmailsPage;
import eleks.com.pages.SuccessSendMailPage;


public class EndUserSteps {
	
	MainPage mainPage;
	MailBoxPage mailBoxPage;
	CreateMailPage createMailPage;
	SuccessSendMailPage successSendMailPage;
	SentEmailsPage sentEmailsPage;
	
	SoftAssertions softly = new SoftAssertions();
	
	Email email = new EmailBuilder().buildTo("to@i.ua")
			.buildSubject("subject_tra_ta_ta").buildBody("body_tra_ta_ta")
			.build();

	public void navigateToMainPage() {
		mainPage.open();	
	}

	public void isOnMaiPageOpened() {
		Assert.assertTrue(mainPage.isMainPageOpened());
	}

	public void positiveLoginAs() {
		mainPage.loginAs("jmeter_test", "Qwerty123456");
	}
	
	public void negativeLoginAs() {
		mainPage.loginAs("jmeter_test1", "Qwerty123456");
	}

	public void isOnMailBoxPageOpened() {
		Assert.assertTrue(mailBoxPage.isMailBoxPageOpened());	
	}

	public void navigateToCreateEmailPage() {
		mailBoxPage.navigateToCreateEmailPage();
	}

	public void isOnCreateEmailPage() {
		Assert.assertTrue(createMailPage.isCreateMailPageOpened());
	}

	public void createEmail() {
		createMailPage.createEmail(email.getTo(), email.getSubject(), email.getBody());	
	}

	public void isSuccessSendMailPageOpened() {
		Assert.assertTrue(successSendMailPage.isSuccessSendMailPageOpened());	
	}

	public void navigateToSentEmailPage() {
		successSendMailPage.navigateToSentEmailPage();	
	}
	
	public void positiveVerifyEmailSubject() {
		Assert.assertTrue(sentEmailsPage.isCorrectSubject(email.getSubject()));
	}

	public void negativeVerifyEmailSubject() {
		Assert.assertFalse(sentEmailsPage.isCorrectSubject("sgfsgfsd"));
	}

	public void openSentEmail() {
		sentEmailsPage.openSentEmail(email.getSubject());
	}

	public void positiveIsCorrectEmailContains() {
		Assert.assertTrue(sentEmailsPage.isCorrectToOnEmail(email.getTo()));
		Assert.assertTrue(sentEmailsPage.isCorrectSubjectOnEmail(email.getSubject()));
		Assert.assertTrue(sentEmailsPage.isCorrectBodyOnEmail(email.getBody()));
		softly.assertAll();
	}

	public void negativeIsCorrectEmailContains() {
		Assert.assertFalse(sentEmailsPage.isCorrectToOnEmail("gdgd"));
		Assert.assertFalse(sentEmailsPage.isCorrectSubjectOnEmail("dgdfg"));
		Assert.assertFalse(sentEmailsPage.isCorrectBodyOnEmail("dfgdfg"));
		softly.assertAll();
	}

	

}
