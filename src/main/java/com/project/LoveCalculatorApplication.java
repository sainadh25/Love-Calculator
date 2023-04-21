package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.project.Formatters.PhoneFormatter;
import com.project.model.Phone;
@SpringBootApplication
public class LoveCalculatorApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(LoveCalculatorApplication.class, args);
	}
	
	

}
