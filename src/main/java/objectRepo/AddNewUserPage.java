package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {
	@FindBy(xpath = "////b[text()='Add New User']")
	private WebElement pageHeader;

	@FindBy(xpath = "//Input[@id='email' and @required]")
	private WebElement emailTF;

	@FindBy(xpath = "//Input[@id='password' and @required]")
	private WebElement passwordTF;

	@FindBy(xpath = "//Input[@id='firstname' and @required]")
	private WebElement firstnameTF;

	@FindBy(xpath = "//Input[@id='lastname' and @required]")
	private WebElement lastnameTF;

	@FindBy(id = "address")
	private WebElement addresstextarea;

	@FindBy(id = "contact")
	private WebElement contactTF;

	@FindBy(xpath = "(//input[@id = 'photo'])[2]")
	private WebElement chooseFile;
	
	@FindBy(name="add")
	private WebElement saveBTN;
	
	public AddNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public String getPageHEader() {
		return pageHeader.getText();
	}
	
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void setFirstName(String FirstName) {
		firstnameTF.sendKeys(FirstName);
	}
	
	public void setLastName(String LastName) {
		lastnameTF.sendKeys(LastName);
	}
	
	public void setAddress(String address) {
		addresstextarea.sendKeys(address);
	}
	
	public void setContact(String contact) {
		contactTF.sendKeys(contact);
	}
	
	public void setphoto(String photopath) {
		chooseFile.sendKeys(photopath);
	}
	
	public void clickSave() {
		saveBTN.click();
	}
	
	

}
