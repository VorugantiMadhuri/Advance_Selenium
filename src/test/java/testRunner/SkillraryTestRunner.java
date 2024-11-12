package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/Featurefiles",
					glue="stepDefinitions",
					plugin= {"pretty",
							"html:target/HTML/report.html",
							"json:target/JSON/report.json",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:target/failed_scenarios.txt"
					})
public class SkillraryTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
