package pagefactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hookspackage.Hooks;

public class CreateAccountPage {
	WebDriver driver = Hooks.driver;
	
	public CreateAccountPage() {
		PageFactory.initElements(driver, CreateAccountPage.class);
	}
	
	
	@FindBy(id  = "nav-link-accountList")
	public WebElement SignInMenuField;
	
	public void clickSingInButton() {
		SignInMenuField.click();
	}

}
