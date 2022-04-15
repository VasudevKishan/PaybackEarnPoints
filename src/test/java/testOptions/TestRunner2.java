package testOptions;

import io.cucumber.testng.*;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        tags = "@InstantVouchers",
        monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {
   
}
