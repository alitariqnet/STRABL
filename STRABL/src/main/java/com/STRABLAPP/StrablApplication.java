package com.STRABLAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StrablApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(StrablApplication.class, args);
		for (String s: apc.getBeanDefinitionNames())
		System.out.println(s);
	}
	
	@Bean(name="STRABL")
	public String getName() {
		return "STRABL";
	}

}
