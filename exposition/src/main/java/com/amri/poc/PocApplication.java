package com.amri.poc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application
 */
@SpringBootApplication(scanBasePackages = "com.amri")
public class PocApplication {

    private static final Logger LOGGER = LogManager.getLogger(PocApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PocApplication.class, args);
        LOGGER.info("**** started");
    }

}
