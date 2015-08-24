package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		format={"pretty","json:target/cucumber.json"},
				
		features={"src/cucumber/"}
		,glue={"stepDefinition"}
		
		
		)
	

public class CucumberRunner {

}
