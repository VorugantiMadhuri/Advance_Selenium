package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath="//h1[normalize-space(text())='Users']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//a[text()=' New']")
	private WebElement newBTN;
	@FindBy(className="alert-success")
	private WebElement successAlert;
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public String getSuccessAlertMessage() {
		return successAlert.getText();
//		return successAlert.getText();
	}
	public void clickNew() {
		newBTN.click();
	}
}
