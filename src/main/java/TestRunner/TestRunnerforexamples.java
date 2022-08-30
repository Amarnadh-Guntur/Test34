package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="/Users/amarnadhguntur/eclipse-workspace/Test34/src/main/java/features/logincheckwithexamples.feature",
glue={"stepDefinition"},
format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		
		)


public class TestRunnerforexamples {

}
