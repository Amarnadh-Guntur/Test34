package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features="/Users/amarnadhguntur/eclipse-workspace/Test34/src/main/java/features/logincheck.feature",
glue={"stepDefinition"},
dryRun=false,
format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		
		)


public class TestRunnerclass {

}
