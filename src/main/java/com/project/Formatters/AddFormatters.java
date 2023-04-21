package com.project.Formatters;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@Configuration
@ComponentScan(basePackages = "com.project.controller")
public class AddFormatters  implements WebMvcConfigurer{

	
	public ReloadableResourceBundleMessageSource message() {
		ReloadableResourceBundleMessageSource message=new ReloadableResourceBundleMessageSource();
		message.setBasename("message");
		return message;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside Add mtd");
		
		registry.addFormatter(new PhoneFormatter());
		
	}
	
	public LocalValidatorFactoryBean validator() {
		
		LocalValidatorFactoryBean localValidatorFactoryBean=new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(message());
		return localValidatorFactoryBean;
		
	}
	@Override
	public Validator getValidator() {
		// TODO Auto-generated method stub
		return validator();
	}
	
	
	
	
	@Bean
	public JavaMailSender MailSender() {
		
		JavaMailSenderImpl javaMailSenderImpl=new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setUsername("kingsainadh25@gmail.com");
		javaMailSenderImpl.setPassword("whiotwtpthcjzpjg");
		javaMailSenderImpl.setPort(587);
		
		
		Properties properties=new Properties();
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.ssl.trust","smtp.gmail.com");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		javaMailSenderImpl.setJavaMailProperties(properties);
		
		
		return javaMailSenderImpl;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
