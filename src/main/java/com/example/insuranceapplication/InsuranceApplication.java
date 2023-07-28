/*
 * Friday, July 28, 2023
 * Universal Insurance Look-up for Dental Insurance Subscribers - Prototype v1.0
 * User Manual available at -> https://github.com/bigshmike/insurance-app/files/12195076/Universal.Insurance.Look-up.pdf
 * Created by Michael Brown
 */

package com.example.insuranceapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}

}
