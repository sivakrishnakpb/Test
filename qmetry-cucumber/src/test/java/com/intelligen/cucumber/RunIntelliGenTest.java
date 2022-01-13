package com.intelligen.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(plugin = {"com.infostretch.qmetrytestmanager.result.TestExecution"})

@CucumberOptions(
		  features = "classpath:com/intelligen/cucumber/intelligen.feature" ,
		  glue = "com.intelligen.cucumber",
		  monochrome = true,
		  format = "json:target/cucumber-json-report.json")


public class RunIntelliGenTest {
}
