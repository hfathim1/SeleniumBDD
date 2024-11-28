package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.stepdefinitin",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true, tags = "@drodown"
)
public class TestRunner {
}
