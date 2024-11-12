package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy(id="last")
	private WebElement loginBTN;
	
	@FindBy(xpath="//h3[text()='Login']")
	private WebElement pageHeader;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void loginToApp(String email,String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		loginBTN.click();
	}
	
}
