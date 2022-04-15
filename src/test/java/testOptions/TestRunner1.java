package testOptions;

import io.cucumber.testng.*;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        tags = "@IsoPartners",
        monochrome = true
)
public class TestRunner1 extends AbstractTestNGCucumberTests {
   
}
