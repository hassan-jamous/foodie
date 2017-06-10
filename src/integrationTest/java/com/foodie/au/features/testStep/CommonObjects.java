package com.foodie.au.features.testStep;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Getter
@Setter
public class CommonObjects {

    @PostConstruct
    public void initializeObjects() {

    }

    public void reInitialize() {
    }
}