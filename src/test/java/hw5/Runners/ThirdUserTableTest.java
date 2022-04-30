package hw5.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/hw5.features/UserTablePageVipCheckbox.feature"},
        glue = {"hw5.Steps"},
        tags = "@third"
)
public class ThirdUserTableTest extends AbstractTestNGCucumberTests {
}
