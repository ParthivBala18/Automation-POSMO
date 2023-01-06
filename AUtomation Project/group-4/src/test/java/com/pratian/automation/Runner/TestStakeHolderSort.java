package com.pratian.automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Feature/Verify_sort.feature",
		glue = { "com.pratian.automation.CucumberSteps" }

		)

public class TestStakeHolderSort {

}
