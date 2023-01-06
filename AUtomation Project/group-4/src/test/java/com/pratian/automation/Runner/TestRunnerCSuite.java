package com.pratian.automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Feature/Sort_CSuite.feature",
		glue = { "com.pratian.automation.CucumberSteps" }

		)

public class TestRunnerCSuite {

}
