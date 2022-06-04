package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},tags= {"@UserMultipleData"},glue= {"stepDefinition"},monochrome=true,format= {"pretty","html:target/cucumber-reports"})
public class Runner1 {

}
