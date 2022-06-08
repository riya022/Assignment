package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		//features = "./src/test/java/Features",
		features = "src/test/java/Features",
		glue = "StepDefination",
	//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = "@smoke" 
		)
public class RunnerAppium extends AbstractTestNGCucumberTests {
}
