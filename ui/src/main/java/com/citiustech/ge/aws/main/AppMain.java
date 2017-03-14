package com.citiustech.ge.aws.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AppMain {
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

	
}
