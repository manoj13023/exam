package com.exam.spring.boot.example;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class DataSourceManagement
{
	@Bean
	@ConfigurationProperties("app.datasource")
	public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	}
}
