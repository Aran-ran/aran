package com.zjrcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AranApplication {

	public static void main(String[] args) {
		SpringApplication.run(AranApplication.class, args);
	}

}
