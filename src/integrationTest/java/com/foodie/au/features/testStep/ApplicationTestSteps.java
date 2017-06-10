package com.foodie.au.features.testStep;

import com.foodie.au.testing.configuration.spring.SpringBootTestWithoutServerStartUpConfigurer;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ApplicationTestSteps extends SpringBootTestWithoutServerStartUpConfigurer {
    @When("^this test runs$")
    public void thisTestRuns() throws Throwable {
        assertEquals(1, 1);
    }

    @Then("^simple assertion should pass$")
    public void simpleAssertionShouldPass() throws Throwable {
        assertEquals(1, 1);
    }
}
