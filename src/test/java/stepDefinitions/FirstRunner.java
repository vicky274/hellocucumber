package stepDefinitions;


import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/First",
        glue = {"stepDefinitions"},
        /*tags = "",*/
        dryRun=false,
        stepNotifications = true,
        monochrome=true,
        plugin ="html:target/Cucumber_maven_Report/cucumber-pretty")
public class FirstRunner {

	
}