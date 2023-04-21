package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.EmailDto;
import com.project.service.LcAppServiceImpl;

@Controller
@RequestMapping("/Spring-love-calculator")

public class EmailController {
	
	@Autowired
	LcAppServiceImpl LcAppService;
	
	@RequestMapping("/sendemail")
	public String sendemail(@ModelAttribute("emailDto") EmailDto emaildto) {
		
		return "send-mail";
	}
	
	@RequestMapping("process-email")
	public String processemail(@ModelAttribute("emailDto") EmailDto emailDto,HttpSession session) {
		String username=(String)session.getAttribute("username");
		try {
		LcAppService.sendingEmail(username,(String) session.getAttribute("crushname"), emailDto.getEmailId(),(String) session.getAttribute("result"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "process-mail";
	}

}
