package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue="stepdef", features="src/test/resources/feature", dryRun=false)
public class RunnerTest {

}
