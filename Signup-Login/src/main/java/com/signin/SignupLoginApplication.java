package com.signin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SignupLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupLoginApplication.class, args);
	}

}
