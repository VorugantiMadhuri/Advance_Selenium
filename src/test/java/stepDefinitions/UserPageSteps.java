package stepDefinitions;

import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddNewUserPage;
import objectRepo.UsersPage;
import utils.ExcelUtility;
import utils.IConstantPath;
import utils.TestContextSetup;

public class UserPageSteps {
	
	TestContextSetup testContextSetup;
	public UserPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	ExcelUtility excel;
	UsersPage users;
	AddNewUserPage adduser;
	@When("add an user")
	public void add_an_user() {
	   users=testContextSetup.pom.getUsers();
	   excel=new ExcelUtility();
	   excel.excelInit(IConstantPath.EXCEL_PATH, "Sheet1");
	   adduser=testContextSetup.pom.getAddUser();
	   Map<String, String>map=excel.readFromExcel("Add User");
	   excel.closeWorkbook();
	   users.clickNew();
	   
	   adduser.setEmail(map.get("Email"));
	   adduser.setPassword(map.get("Password"));
	   adduser.setFirstName(map.get("Firstname"));
	   adduser.setLastName(map.get("Lastname"));
	   adduser.setAddress(map.get("Address"));
	   adduser.setContact(map.get("Contact Info"));
	   adduser.setphoto(map.get("Photo"));
	   adduser.clickSave();
	}
	@Then("user should be created")
	public void user_should_be_created() {
	   System.out.println(users.getSuccessAlertMessage());
	}





}
