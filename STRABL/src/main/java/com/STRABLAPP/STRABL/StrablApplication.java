package com.STRABLAPP.STRABL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.STRABLAPP")
@EnableJpaRepositories("repository")
public class StrablApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrablApplication.class, args);
	}

}
