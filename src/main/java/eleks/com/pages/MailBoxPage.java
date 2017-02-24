package eleks.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailBoxPage extends BasePage {

	public MailBoxPage(WebDriver webDriver) {
		super(webDriver);
	}

	@FindBy(xpath = "//descendant::li[@class='sn_menu_item '][1]/descendant::a")
	// @FindBy(xpath = "//input[@name='send']")
	public WebElement createMail;

	@FindBy(xpath = "//descendant::li[@class='sn_menu_item '][2]/descendant::a")
	public WebElement contacts;

	@FindBy(xpath = "//descendant::li[@class='sn_menu_item '][3]/descendant::a")
	public WebElement checkMailBox;

//	@FindBy(xpath = "//descendant::ul[@class='list_underlined']/descendant::li[2]")
//	public WebElement goToSentEmails;

	@FindBy(xpath = "//li[@class='ho_menu_item'][3]/span")
	public WebElement settings;

	@FindBy(xpath = ".//*[@id='accountSettingsPopup']")
	public WebElement settings_popUp;

	@FindBy(xpath = ".//*[@id='accountSettingsPopup']/descendant::li[7]/a")
	public WebElement logout;

	public boolean isMailBoxPageOpened() {
		if (isElementPresent(createMail) && isElementPresent(contacts)
				&& isElementPresent(checkMailBox)) {

			return true;
		} else {
			return false;
		}
	}

	public MainPage logout() {
		settings.click();
		WebDriverWait wait = new WebDriverWait(webDriver, 60);
		wait.until(ExpectedConditions.visibilityOf(settings_popUp));
		logout.click();
		return PageFactory.initElements(webDriver, MainPage.class);
	}

	public CreateMailPage navigateToCreateEmailPage() {
		createMail.click();
		return PageFactory.initElements(webDriver, CreateMailPage.class);
	}
	
//	public SentEmailsPage navigateToSentEmailPage() {
//		goToSentEmails.click();
//		return PageFactory.initElements(webDriver, SentEmailsPage.class);
//	}
	
	
	
	

}
