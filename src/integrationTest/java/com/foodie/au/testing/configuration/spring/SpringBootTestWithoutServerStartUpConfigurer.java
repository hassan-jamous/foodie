package com.foodie.au.testing.configuration.spring;

import com.foodie.au.SpringApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = SpringApplication.class, loader = SpringBootContextLoader.class)
@SpringBootTest
public class SpringBootTestWithoutServerStartUpConfigurer {
}