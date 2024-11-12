package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverUtility;

public class CategoryPage {
	@FindBy(xpath="//h1[normalize-space(text())='Category']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//a[text()=' New']")
	private WebElement newBTN;
	
	@FindBy(className="alert-success")
	private WebElement successAlert;
	
	private String deletePath="//td[text()='%s']/following-sibling::td/descendant::button[text()=' Delete']";
	@FindBy(name="delete")
	private WebElement deleteBTN;
	
	public CategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickNew() {
		newBTN.click();
	}
	
	public String getSuccessAlertMessage() {
		return successAlert.getText();
	}
	public void deleteCourse(DriverUtility driverUtil,String courseName) {
		driverUtil.convertDynamicPathToWebElement(deletePath, courseName).click();
		deleteBTN.click();
	}
}
