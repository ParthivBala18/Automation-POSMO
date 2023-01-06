package com.pratian.automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Feature/Navigate_Internal_External.feature",
		glue = { "com.pratian.automation.CucumberSteps" }

		)

public class TestRunnerStakeHolder {

}




