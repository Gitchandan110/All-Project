package CucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", glue= {"stepDefinition"}, 
plugin={"pretty","html:Test-Output", "json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"},
monochrome=true, //display console output in readable format
strict=true, //If step definition is not written for any feature then it will display error in console.
dryRun=false //if error in code then it will display error before running the script.

)

public class TestRunner {

}
