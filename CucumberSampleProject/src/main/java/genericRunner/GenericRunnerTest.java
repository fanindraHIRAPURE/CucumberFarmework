package genericRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features"
		,glue={"stepDefinitions","hookspackage"},tags = "@createAccountPageVisible,@"
		,monochrome = true
		)
public class GenericRunnerTest {

}
