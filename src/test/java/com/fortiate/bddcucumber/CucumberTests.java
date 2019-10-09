package com.fortiate.bddcucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

//https://sukesh15.gitbooks.io/cucumber-jvm-test-framework-/content/cucumber_-_more_details/scenario_tagging.html

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		//glue = "src/test/java/com/fortiate/bddcucumeber/GlueCode.java" , 
		plugin = {"pretty", "html:target/cucumber"}, 
		tags = {"@WIP", "~@ON-HOLD"})
public class CucumberTests {
	
	//https://www.toolsqa.com/cucumber/cucumber-options/
	//https://testingneeds.wordpress.com/tag/cucumberoptions/
}