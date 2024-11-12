package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Before
	public void beforeScenario() {
		testContextSetup.driverUtil.maximizeBrowser();
		long time=Long.parseLong(testContextSetup.property.readFromFile("timeouts"));
		testContextSetup.driverUtil.waitTillElementFound(time);
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		if(scenario.isFailed()) {
			File screenshot =testContextSetup.driverUtil.getScreenshot(scenario.getName());
			byte[] byteArray=null;
			try {
				byteArray=FileUtils.readFileToByteArray(screenshot);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			scenario.attach(byteArray, "image/png", "failed-test");
		}
	}
	
	@After
	public void afterScenario() {
		testContextSetup.driverUtil.quitAllWindow();
	}
	

}
