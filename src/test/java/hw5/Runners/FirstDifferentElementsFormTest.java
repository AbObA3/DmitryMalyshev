package hw5.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/hw5.features/DifferentElementsPage.feature"},
        glue = {"hw5.Steps"},
        tags = "@first"
)
public class FirstDifferentElementsFormTest extends AbstractTestNGCucumberTests {
}
