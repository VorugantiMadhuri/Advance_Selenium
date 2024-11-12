
package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverUtility;

public class AddNewCoursePage {
	
	@FindBy(xpath = "//b[text()='Add New Course']")
	private WebElement pageHeader;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameTF;
	
	@FindBy(id = "category")
	private WebElement categoryDropdown;
	
	@FindBy(id = "price")
	private WebElement priceTF;
	
	@FindBy(xpath = "(//input[@id = 'photo'])[2]")
	private WebElement chooseFile;
	
	@FindBy(xpath = "//iframe[@title = 'Rich Text Editor, editor1']")
	private WebElement descriptionFrame;
	
	@FindBy(xpath = "//html/body/p")
	private WebElement descriptionBody;
	
	@FindBy(name = "add")
	private WebElement saveBTN;

	public AddNewCoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void setName(String name) {
		nameTF.sendKeys(name);
	}
	
	public void chooseCategory(DriverUtility driverUtil, String text) {
		driverUtil.selectAnOption(categoryDropdown, text);
	}
	
	public void setPrice(String price) {
		priceTF.sendKeys(price);
	}
	
	public void setPhoto(String photoPath) {
		chooseFile.sendKeys(photoPath);
	}

	public void setDescription(DriverUtility driverUtil, String description) {
		driverUtil.switchToframe(descriptionFrame);
		descriptionBody.sendKeys(description);
		driverUtil.switchBackFromFrame();
	}
	
	public void clickSave() {
		saveBTN.click();
	}
}
