package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
    For tags:
        - @wip : automation work in progress
        - @ci : main feature for CI/CD
        - @{featureName} : run automation for specific feature
        - @regression : run automation for all feature
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinition", "hook"},
        plugin = {"pretty", "json:target/cucumber.json"},
        tags = "@login"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
