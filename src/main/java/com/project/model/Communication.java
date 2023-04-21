package com.project.model;

import com.project.Annotation.ValidPhoneNumber;

public class Communication {
	
	private String email;
	
	@ValidPhoneNumber
	private Phone phone;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
