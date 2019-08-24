package com.codebot.springconsole.application;

import com.codebot.springconsole.component.Runner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {Runner.class})
public class SpringConsoleApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringConsoleApplication.class);

    public static void main(String[] args) {
        logger.info("APPLICATION EXECUTION - INITIATED");
        SpringApplication.run(SpringConsoleApplication.class, args);
        logger.info("APPLICATION EXECUTION - COMPLETED");
    }
}
