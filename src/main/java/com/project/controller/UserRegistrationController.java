package com.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Communication;
import com.project.model.Phone;
import com.project.model.UserRegistration;

@Controller
@RequestMapping("/Spring-love-calculator")
public class UserRegistrationController {

	@RequestMapping("/Register")
	public String RegPage(@ModelAttribute("userReg") UserRegistration usr) {
//		UserRegistration usr=new UserRegistration();
//		model.addAttribute("userReg", usr);
//		Phone ph=new Phone();
//		ph.setCountryCode("91");
//		ph.setNumber("1234");
//		Communication com=new Communication();
//		com.setPhone(ph);
		
		
//		usr.setCommunication(com);
		
		
		
		return "registration-page";
	}
	@RequestMapping("/registration-success")
	public String RegSuccess(@Valid @ModelAttribute("userReg") UserRegistration usr,BindingResult result) {
		
		if (result.hasErrors()){
			System.out.println("has errors");
			List<ObjectError> l=result.getAllErrors();
			for(ObjectError e:l) {
				System.out.println("Error msg : "+e);
			}
			return "registration-page";
		}
		
		return "registration-success";
	}
	
	
}
