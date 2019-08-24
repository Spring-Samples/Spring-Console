package com.codebot.springconsole.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("EXECUTING : Command Line Runner");
        for (int i = 0; i < 100; i++) {
            longTask();
            logger.info("Hello || Console Runner || {}", String.format("%02d", i));
        }
    }

    private void longTask() {
        try {
            long timeDelay = 1000L;
            Thread.sleep(timeDelay);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
        }
    }

}
