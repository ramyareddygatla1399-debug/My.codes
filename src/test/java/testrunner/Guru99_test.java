package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ravali\\eclipse-workspace\\.metadata\\Selenium.program2908\\src\\test\\java\\My.codes\\Feature\\guru99.feature",
       glue="stepdefinition",
       tags="@smoke and  @Regression"
		)

public class Guru99_test {

}
