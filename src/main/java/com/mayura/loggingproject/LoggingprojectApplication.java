package com.mayura.loggingproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingprojectApplication {

    private static final Logger log =
            LoggerFactory.getLogger(LoggingprojectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggingprojectApplication.class, args);
        log.info("Logging project started successfully");
    }
}