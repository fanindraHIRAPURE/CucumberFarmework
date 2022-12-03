package stepDefinitions;

import io.cucumber.java.en.And;
import pagefactoryPages.CreateAccountPage;

public class CreateAccountPageSteps {
	CreateAccountPage accountPage;
	
	@And("^user clicks on signIn menu$")
	public void clickSingInMenu() {
		System.out.println("Enter in singIn Menu");
		accountPage = new CreateAccountPage();
		accountPage.clickSingInButton();
		
	}

} 
