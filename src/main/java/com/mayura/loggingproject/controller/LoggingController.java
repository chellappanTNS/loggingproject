package com.mayura.loggingproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private static final Logger log =
            LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/api/logging/test")
    public String testLogging() {

        MDC.put("userId", "USER001");

        log.info("Test logging request received");

        MDC.remove("userId");

        return "Logging test successful";
    }
    @GetMapping("/api/logging/login")
    public String login() {

        String username = "user001";
        String password = "secret123";

        log.info("Login attempt for user: {}", username);

        // Never log the password
        // log.info("Password: {}", password);

        return "Login successful";
    }
}