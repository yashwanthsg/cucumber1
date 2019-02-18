package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/AbiBus.feature", glue= {"steps"}, plugin= {"html:target"}, monochrome=true
                                 ,dryRun=false)
public class TestRunner {

}
