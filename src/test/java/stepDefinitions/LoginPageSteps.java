package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Given;
import objectRepo.LoginPage;
import utils.TestContextSetup;

public class LoginPageSteps {
	TestContextSetup testContextSetup;
	LoginPage login;
	
	public LoginPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Given("I navigate to skillrary app")
	public void i_navigate_to_skillrary_app() {
		testContextSetup.driverUtil.navigateToApp(testContextSetup.property.readFromFile("url"));
	}
@And("login to skillrary as admin")
public void login_to_Skillrary_as_admin() {
	login=testContextSetup.pom.getLogin();
	login.loginToApp(testContextSetup.property.readFromFile("username"), testContextSetup.property.readFromFile("password"));
}
}
