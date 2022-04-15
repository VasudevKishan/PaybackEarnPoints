package testOptions;

import io.cucumber.testng.*;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        tags = "@OnlineShopping",
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
   
}
