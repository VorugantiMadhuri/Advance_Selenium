package objectRepo;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLogin() {
		
		return new LoginPage(driver);
	}
	
	public DashboardPage getDashoard() {
		return new DashboardPage(driver);
	}
	
	public UsersPage getUsers() {
		return new UsersPage(driver);
		
	}
	
	public AddNewUserPage getAddUser() {
		return new AddNewUserPage(driver);
	}
	
	public CourseListPage getCourseList() {
		return new CourseListPage(driver);
	}
	public AddNewCoursePage getAddCourse() {
		return new AddNewCoursePage(driver);
	}
	
	public CategoryPage getCategory() {
		return new CategoryPage(driver);
	}
	
public AddNewCategoryPage getAddCategory() {
	return new AddNewCategoryPage(driver);
}



}
