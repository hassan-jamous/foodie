package com.foodie.au.testing.configuration.cucumber;

import com.foodie.au.features.testStep.CommonObjects;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class GlobalHooks {
    @Autowired
    private CommonObjects commonObjects;

    @Before
    public void beforeAll() {
        commonObjects.reInitialize();
    }
}
