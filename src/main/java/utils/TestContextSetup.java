package utils;

import org.openqa.selenium.WebDriver;

import objectRepo.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public DriverUtility driverUtil;
	public PropertiesUtility property;
	public PageObjectManager pom;
	
	public TestContextSetup() {
		property=new PropertiesUtility();
		driverUtil =new DriverUtility();
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		driver=driverUtil.launchBrowser(property.readFromFile("browser"));
		pom =new PageObjectManager(driver);
	}

}
