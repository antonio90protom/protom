package com.protom.mytime.config;

import javax.sql.DataSource; 
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /*Serve per la configurazione del collegamento al DB*/
public class DataSourceConfig {
	@Bean
	public DataSource dataSource () {
		return DataSourceBuilder.create()
		.driverClassName("com.mysql.cj.jdbc.Driver")
		.url("jdbc:mysql://localhost:3306/mytime")
		.username("root")
		.password("corso")
		.build();
		
	
	}

}
