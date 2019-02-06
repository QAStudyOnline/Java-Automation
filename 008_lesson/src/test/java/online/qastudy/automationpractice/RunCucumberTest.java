package online.qastudy.automationpractice;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/resources/features",
        monochrome = true,
        tags = "@TestScenarioV1",
        glue={"online.qastudy.steps"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
