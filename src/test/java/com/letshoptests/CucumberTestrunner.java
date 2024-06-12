package com.letshoptests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/loginLetshop.feature"}, 
glue = {"stepDefinition"}, monochrome=true,plugin= {"pretty","html:target/cucumber-report.html"})
public class CucumberTestrunner extends AbstractTestNGCucumberTests {

}
