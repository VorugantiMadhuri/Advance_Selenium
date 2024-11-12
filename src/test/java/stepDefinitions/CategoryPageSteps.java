package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddNewCategoryPage;
import objectRepo.CategoryPage;
import objectRepo.PageObjectManager;
import utils.DriverUtility;
import utils.IConstantPath;
import utils.PropertiesUtility;
import utils.TestContextSetup;

public class CategoryPageSteps {
	TestContextSetup testContextSetup;
//	WebDriver driver;
//	DriverUtility driverUtil;
//	PropertiesUtility property;

	CategoryPage category;
	AddNewCategoryPage addCategory;
	String newCategoryName;
	
	public CategoryPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
//	
//	@Given("I navigate to skillrary app")
//	public void i_navigate_to_skillrary_app() {
//
//     property=new PropertiesUtility();
//     driverUtil=new DriverUtility();
//     
//     property.propertiesInit(IConstantPath.PROPERTIES_PATH);
//     driver=driverUtil.launchBrowser(property.readFromFile("browser"));
//     driverUtil.maximizeBrowser();
//     driverUtil.navigateToApp(property.readFromFile("url"));
//     
//     long time=Long.parseLong(property.readFromFile("timeouts"));
//     driverUtil.waitTillElementFound(time);
//		
//	}
//	
//
//	@And("login to Skillrary as admin")
//	public void login_to_skillrary_as_admin() {
//	    pom=new PageObjectManager(driver);
//	     login=  pom.getLogin();
//	     login.loginToApp(property.readFromFile("username"), property.readFromFile("password"));
//	     
//	}
//
//	@When("I enter category page")
//	public void i_enter_category_page() {
//	   dashboard= pom.getDashoard();
//	   dashboard.clickCourses();
//	   dashboard.clickCategroy();
//	   
//	}

	@When("^add a (.*)$")
	public void add_a_category(String categoryName) {
	 category = testContextSetup.pom.getCategory();
	 category.clickNew();
	 
	   addCategory= testContextSetup.pom.getAddCategory();
	   
	   newCategoryName = categoryName;
	   addCategory.setName(categoryName);
	   addCategory.clickSave();
	   
	}

	@Then("category should be created")
	public void category_should_be_created() {
	    System.out.println(category.getSuccessAlertMessage());
	}

	@When("I delete category")
	public void i_delete_category() {
	    category.deleteCourse(testContextSetup.driverUtil, newCategoryName);
	}

	@Then("category should be removed from category list")
	public void category_should_be_removed_from_category_list() {
	    System.out.println(category.getSuccessAlertMessage());
	}
//
//	@And("logout of skillrary")
//	public void logout_of_skillrary() {
//	    dashboard.signOutOfApp();
//	    driverUtil.quitAllWindow();
//	}



}

