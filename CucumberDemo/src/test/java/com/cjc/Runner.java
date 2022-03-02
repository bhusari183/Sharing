package com.cjc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src//test/resources//features"}, glue= {"com.cjc"})
public class Runner {

	
}
