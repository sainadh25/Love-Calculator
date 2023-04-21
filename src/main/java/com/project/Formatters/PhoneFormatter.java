package com.project.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.project.model.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		
		//Print mtd is used to display the default data in jsp page
		
		System.out.println("inside print");
		return object.getCountryCode()+"-"+object.getNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("inside const print parse");
		Phone ph=new Phone();
		if(text.contains("-")) {
		String[] arr=text.split("-");
		System.out.println(arr[0]+""+arr[1]);
		ph.setCountryCode(arr[0]);
		if (arr[0]=="")
			ph.setCountryCode("91");
		
		ph.setNumber(arr[1]);
		}
		else {
			ph.setCountryCode("91");
			ph.setNumber(text);
		}
		return ph;
	}

	
	

	
}
