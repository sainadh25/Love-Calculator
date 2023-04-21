package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class LcAppServiceImpl implements LcAppServiceInterface  {

	@Autowired
	private JavaMailSender javaMailSenderImpl;
	
	@Override
	public void sendingEmail(String Username,String crushname, String email, String result) {
		// TODO Auto-generated method stub
		
	SimpleMailMessage mailMessage=new SimpleMailMessage();
	mailMessage.setTo(email);
	mailMessage.setSubject("LC APP");
	mailMessage.setText("Hi "+ "Mr."+ Username + ".\nThe LC App Predicted that you and "+crushname+ " are "+ result);
	javaMailSenderImpl.send(mailMessage);
		
	}

}
