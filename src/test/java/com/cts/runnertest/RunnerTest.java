package com.cts.runnertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/main/resources/feature/OpenCart.feature"},
	glue= {"com/cts/stepdefintion"},strict=true,//dryRun=true,
	//tags= {"@valid"},
	plugin= {"html:reports/","pretty"})//when step definition not there it will throw error)
	@RunWith(Cucumber.class)
	public class RunnerTest {

	
	
	}

