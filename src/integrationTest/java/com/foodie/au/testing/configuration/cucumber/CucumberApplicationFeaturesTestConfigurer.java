package com.foodie.au.testing.configuration.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class CucumberApplicationFeaturesTestConfigurer {
    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/integrationTest/resources/features/set1", glue = "com.foodie.au.features.testStep")
    public static class CucumberSet1 {
    }
}

