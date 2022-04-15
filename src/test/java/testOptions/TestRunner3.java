package testOptions;

import io.cucumber.testng.*;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        tags = "@BankingPartners",
        monochrome = true
)
public class TestRunner3 extends AbstractTestNGCucumberTests {
   
}

