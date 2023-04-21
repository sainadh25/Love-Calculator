package com.project.Validator;

import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import com.project.model.UserRegistration;

public class UserNameValidator implements org.springframework.validation.Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		UserRegistration userRegistration=new UserRegistration();
		
		return userRegistration.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "message", "Cant be null");
		
	}
	
	
}