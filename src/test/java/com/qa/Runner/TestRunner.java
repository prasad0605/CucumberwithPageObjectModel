package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Prasad\\eclipse-workspace\\CucumberwithPageObjectModel\\Feature\\Features.feature",//path of Feature file
glue= {"com/qa/Stepdefinition"},//path of the StepDefinition file
format= {"pretty","html:test-output","json:test-output/cucumber.json","junit:test-output/cucumber.xml"},//different type of reports
dryRun=false,//to check mapping between feature file and step definition file
monochrome=true, //to display output in console in proper readable format
strict=true)
//tags= {"~@RegressionTest","~@SmokeTest","~@End2End"})//it will check if any step is not defined inside step definition file
public class TestRunner {
	

}

//~ means ignore the tagging and execute setpdefinition which are not assigned to tag
