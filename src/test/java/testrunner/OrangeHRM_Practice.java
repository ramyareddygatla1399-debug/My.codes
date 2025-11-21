package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Ravali\\eclipse-workspace\\.metadata\\Selenium.program2908\\src\\test\\java\\My.codes\\Feature\\OrangeHRM_Practice.feature",
glue= "stepdefinition",
dryRun=false,
monochrome=true,
plugin= {"pretty","rerun:target/failed.scenarios.txt"}


		)
public class OrangeHRM_Practice {

}
