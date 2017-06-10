package com.foodie.au.testing.configuration.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/integrationTest/resources/features/performance", glue = "com.foodie.au.features.testStep")
public class CucumberPerformanceFeaturesTestConfigurer {
}
