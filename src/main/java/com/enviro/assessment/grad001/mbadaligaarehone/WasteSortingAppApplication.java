/**
 * @Author Mbadaliga Arehone
 *
 * Main entry point for the Waste Sorting Application.
 *
 * This class bootstraps the Spring Boot application and initializes the necessary
 * components. It sets up the application context, scans for components, and
 * launches the embedded server to handle incoming requests.
 */
package com.enviro.assessment.grad001.mbadaligaarehone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WasteSortingAppApplication {

	/**
	 * The main method serves as the entry point for the Spring Boot application.
	 *
	 * @param args Command-line arguments passed during application startup.
	 *             Typically used to pass configuration properties.
	 */
	public static void main(String[] args) {
		SpringApplication.run(WasteSortingAppApplication.class, args);
	}
}
