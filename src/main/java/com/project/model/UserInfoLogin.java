package com.project.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

public class UserInfoLogin {
	
	@NotBlank(message = "*Your name can't b null")
	@Size(min=3,max = 10,message = "*Pls enter atleast 3 characters")
	private String username;
	
	@NotBlank(message = "*Crush name can't b null")
	@Size(min=3,max = 10,message = "*Pls enter atleast 3 characters")
	private String crushname;
	
	@AssertTrue(message = "You have to agree to the TC's")
	private Boolean check;
	
	private String result;
	
	public Boolean getCheck() {
		return check;
	}
	public void setCheck(Boolean check) {
		this.check = check;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
