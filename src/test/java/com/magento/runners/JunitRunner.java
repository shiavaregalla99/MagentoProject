package com.magento.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Sprint1\\login.feature"
,glue= {"com.magento.steps"}
,monochrome=true
		
		)

public class JunitRunner {

}
