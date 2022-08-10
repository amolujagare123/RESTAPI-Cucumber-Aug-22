package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Login2.feature"
        , glue="stepdefinition"
,tags = "@Subscription")

public class TestRunner {
}
