package com.project.model;

import javax.validation.Valid;

import com.project.Annotation.Age;

public class UserRegistration {

	private String Name;
	private String Username;
	private char[] Password;
	private String Country;
	private String[] Hobbies;
	
	@Valid
	private Communication communication;
	private String Gender;
	
	@Age
	private Integer age;
	

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Communication getCommunication() {
		return communication;
	}
	public void setCommunication(Communication communication) {
		this.communication = communication;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public char[] getPassword() {
		return Password;
	}
	public void setPassword(char[] password) {
		Password = password;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String[] getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}
	
}
