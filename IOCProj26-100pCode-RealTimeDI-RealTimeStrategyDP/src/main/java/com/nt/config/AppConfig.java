package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.nt")
public class AppConfig {
	
	@Bean(name="oraDS")
	public DriverManagerDataSource createDSForOracle() {
		DriverManagerDataSource drds = new DriverManagerDataSource();
		drds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		drds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		drds.setUsername("System");
		drds.setPassword("Admin");
		return drds;
	}

	@Bean(name="mysqlDs")
	public DriverManagerDataSource createDsForMySQL() {
		DriverManagerDataSource drds = new DriverManagerDataSource();
		drds.setDriverClassName("com.mysql.cj.jdbc.driver");
		drds.setUrl("jdbc:mysql://ntaj415db");
		drds.setUsername("root");
		drds.setPassword("Ajay@1234");
		return drds;
	}
}
