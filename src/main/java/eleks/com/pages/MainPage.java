package eleks.com.pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("http://i.ua")
public class MainPage extends BasePage {

	public MainPage(WebDriver webDriver) {
		super(webDriver);
	}

	@FindBy(xpath = "//p[2]/input")
	public WebElement login_username;

	@FindBy(xpath = "//input[@name='pass']")
	public WebElement login_password;

	@FindBy(xpath = "//form/p/input")
	public WebElement submitLogin;
	
	@FindBy(xpath = "//a[@class='mbox_16']/descendant::i")
	public WebElement navigateMailBox;

/*	public void open() {
		webDriver.get(ConfigProperties.getProperties("url"));
	}*/

	public boolean isMainPageOpened() {
		if (isElementPresent(login_username)
				&& isElementPresent(login_password)
				&& isElementPresent(submitLogin)) {
			return true;
		} else {
			return false;
		}
	}

	public MailBoxPage loginAs(String username, String pass) {
		login_username.click();
		type(login_username, username);
		type(login_password, pass);
		submitLogin.click();
		if (webDriver instanceof InternetExplorerDriver){
			navigateMailBox.click();
		}
		return PageFactory.initElements(webDriver, MailBoxPage.class);
	}

}
