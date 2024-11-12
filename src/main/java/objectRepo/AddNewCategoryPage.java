package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCategoryPage {
	     @FindBy(xpath="//b[text()='Add New Category']")
	     private WebElement pageHeader;
	     
	     @FindBy(id="name")
	     private WebElement nameTF;
	     
	     @FindBy(name="add")
	     private WebElement saveBTN;
	     
	     public AddNewCategoryPage(WebDriver driver) {
	 		
	 		PageFactory.initElements(driver,this);
	 	}
	 	
	 	public String getPageHeader() {
	 		return pageHeader.getText();
	 	}
	 	
	 	public void setName(String name) {
	 		nameTF.sendKeys(name);
	 	}
	 	public void clickSave() {
	 		saveBTN.click();
	 	}
	 	
	}


