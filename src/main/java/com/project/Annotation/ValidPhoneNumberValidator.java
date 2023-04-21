package com.project.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.project.model.Phone;

public class ValidPhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, Phone> {
	
	int lengthOfNum;
	

	@Override
	public void initialize(ValidPhoneNumber constraintAnnotation) {
		// TODO Auto-generated method stub
		System.out.println("Inside ValidPhoneNumberValidator======");
		this.lengthOfNum= constraintAnnotation.lengthOfNum();
		
	}
	
	@Override
	public boolean isValid(Phone value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		System.out.println("Inside ValidPhoneNumberValidator======22");
		boolean check=true;
		try {
			System.out.println("Inside try");
			System.out.println(value.getNumber());
			Long x=Long.valueOf(value.getNumber());
			
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Inside catch");
			check=false;
		}
		if(!check)
			return false;
		if(value==null) {
			return false;
		}
		System.out.println("Number inside ValidPhone anno::+"+value.getCountryCode()+value.getNumber()+" length i:: "+(value.getCountryCode()+value.getNumber()).length());
		System.out.println("lengthOfNum:: "+lengthOfNum);
		
		if((value.getCountryCode()+value.getNumber()).length()-2!=lengthOfNum) {
			return false;
		}
		
		return true;
	}
	

}
