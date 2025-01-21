package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Customers.feature",
		glue = "StepDefinition",
		//tags = "@sanity1",
		dryRun = false, // true - run in console only, false - will run in browser
		monochrome=true, // to see output in readable format in console window
				//plugin= {"pretty", "html:target/cucumberReports/report1.html", "json:target/JSON/cucumber.json" }
		plugin= {"pretty", "html:target/cucumberReports/report1.html"}
		)
public class Run {
// this class will be empty	
}
