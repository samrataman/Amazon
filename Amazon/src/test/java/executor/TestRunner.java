package executor;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features/login.feature",
				glue = "stepDefinition",
//				tags = "",
				monochrome = true,
				plugin = {"pretty", "html:target/report.html", "json:target/report.json"}

		)




public class TestRunner{
	
}