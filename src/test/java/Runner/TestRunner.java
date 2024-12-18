package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="StepDefinations",
		plugin= {"pretty","html:Reports/cucumberreport.html"}, 
		tags="@All"
		)
public class TestRunner {

}
