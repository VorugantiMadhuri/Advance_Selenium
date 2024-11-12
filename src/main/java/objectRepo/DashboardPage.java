package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	@FindBy(xpath="//h1[normalize-space(text())='Dashboard']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement userTab;
	
	@FindBy(xpath="//span[text()='Courses']")
	private WebElement coursesTab;
	
	@FindBy(xpath="//a[text()=' Course List']")
	private WebElement courseLinkList;

	@FindBy(xpath="//a[text()=' Category']")
	private WebElement categoryLink;
	
	@FindBy(xpath="//span[text()='SkillRary Admin']")
	private WebElement skillraryAdmin;
	
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement signOutLink;
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickUsers() {
		userTab.click();
	}
	public void clickCourses() {
		coursesTab.click();
	}
	public void clickcourseList() {
		courseLinkList.click();
	}
	public void clickCategroy() {
		categoryLink.click();
	}
	
	public void signOutOfApp() {
		skillraryAdmin.click();
		signOutLink.click();
	}

}
