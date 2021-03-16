package autoGenerateRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/SeleniumWorkspace/cucumber-scenarios-parallel/cucumber-scenarios-parallel-example-master/src/test/resources/features/Second/Feature3.feature"},
        plugin = {"json:C:/SeleniumWorkspace/cucumber-scenarios-parallel/cucumber-scenarios-parallel-example-master/target/cucumber-parallel/json/3.json"},
        monochrome = true,
        tags = {},
        glue = {"stepDefinitions"})
public class Parallel03IT {
}
