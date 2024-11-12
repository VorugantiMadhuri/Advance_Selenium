package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import objectRepo.DashboardPage;
import utils.TestContextSetup;

public class DashboardPageSteps {
	TestContextSetup testContextSetup;
	DashboardPage dashboard;
	public DashboardPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@When("I enter category page")
	public void  i_enter_category_page() {
		dashboard=testContextSetup.pom.getDashoard();
		dashboard.clickCourses();
		dashboard.clickCategroy();
	}
	
	@When("I enter course page")
	public void i_enter_course_page() {
		dashboard=testContextSetup.pom.getDashoard();
		dashboard.clickCourses();
		dashboard.clickcourseList();
		
	}
	@When("I enter user page")
	public void i_enter_user_page() {
		dashboard=testContextSetup.pom.getDashoard();
		dashboard.clickUsers();
	}
@And("logout of skillrary")
public void logout_of_skillrary() {
	dashboard.signOutOfApp();
}
}
