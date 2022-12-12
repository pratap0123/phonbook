package com.pd.main;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PhonebookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookAppApplication.class, args);
		System.out.println("Phonebook app strated...");
	}

	@Bean
	public ModelMapper getModelMapper() {

		return new ModelMapper();
	}
}
