package com.project.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class AgeValidator implements ConstraintValidator<Age,Integer> {

	
	int lower;
	int upper;
	
	
	@Override
	public void initialize(Age constraintAnnotation) {
		this.upper= constraintAnnotation.upper();
		this.lower= constraintAnnotation.lower();
		System.out.println("lower::"+lower+" Upper::"+upper);
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		System.out.println(value);
		if(value==null) {
			return false;
		}
		if(value<lower || value>upper) {
			return false;
		}
		
		
		return true;
	}

}
