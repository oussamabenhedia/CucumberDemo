package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "C:\\Users\\ASUS\\git\\CucumberDemo\\cucumberdemo\\features\\login.feature", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files*
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting

		)


public class TestRunner {

}
