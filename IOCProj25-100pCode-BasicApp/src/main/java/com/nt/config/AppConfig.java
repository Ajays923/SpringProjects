package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.beans") // alternate to <context:component-scan)
public class AppConfig {
	
	@Bean("ltd")
	public LocalDateTime createLocalDateTime() {
		System.out.println("AppConfig.createLocalDateTime() (@Bean Method)");
		LocalDateTime ltd =LocalDateTime.now(); // gives system date and time
		return ltd;
	}
	
	
}
