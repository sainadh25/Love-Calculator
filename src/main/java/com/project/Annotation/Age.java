package com.project.Annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.springframework.beans.factory.annotation.Value;




@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {AgeValidator.class })
public @interface Age {
	
	
	
	String message() default "{message.Age}";
	int lower() default 18;
	int upper() default 60;
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
