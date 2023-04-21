package com.project.Annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ValidPhoneNumberValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.TYPE_PARAMETER,ElementType.PARAMETER })
public @interface ValidPhoneNumber {
	
	String message() default "{message.Phone}";
	
	
	int lengthOfNum() default 10;
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	

}
