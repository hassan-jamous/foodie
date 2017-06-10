package com.foodie.au;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.io.*;

@Configuration
@SpringBootApplication
public class SpringApplication {
    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        ApplicationContext ctx = org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }

    @Bean
    public PropertySource<?> yamlPropertySourceLoader() throws IOException {
        YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
        PropertySource<?> applicationYamlPropertySource = loader.load(
                "application.yml", new ClassPathResource("application.yml"), "default");
        return applicationYamlPropertySource;
    }

}