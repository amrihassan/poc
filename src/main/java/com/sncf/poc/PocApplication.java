package com.sncf.poc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication(scanBasePackages = "com.sncf")
public class PocApplication {

	private static final Logger LOGGER = LogManager.getLogger(PocApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
		LOGGER.info("**** started");
	}

}
