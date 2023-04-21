package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.model.UserInfoLogin;
import com.project.service.LcProcessRelationImpl;

@Controller
@RequestMapping("/Spring-love-calculator")
@SessionAttributes("userInformation")
public class LCHomepageController {
	Logger logger=Logger.getLogger(LCHomepageController.class);

	@Autowired
	LcProcessRelationImpl lcProcessRelationImpl;
//	@RequestMapping("/")
//	public String Homepage(Model model) {
//		UserInfoLogin user=new UserInfoLogin();
//		model.addAttribute("username1", user);
//		return "home-page";
//	}

	@RequestMapping("/")
	public String Homepage(Model model) {
		model.addAttribute("userInformation", new UserInfoLogin());

//		if(request.getCookies()!=null) {
//		Cookie[] cookie=request.getCookies();
//		for(Cookie temp:cookie) {
//			if (temp.getName().equals("lc.username")) {
//				us.setUsername(temp.getValue());
//			}    
//		}
//		}

		return "home-page";
	}

//	@RequestMapping("/process-homepage")
//	public String showResultpage(@RequestParam("username") String un,
//			@RequestParam("crushname") String cn,Model model) {
//		System.out.println("username :"+un);
//		System.out.println("crushname :"+cn);
//		
//		model.addAttribute("username", un);
//		model.addAttribute("crushname", cn);
//		return "result-page";
//	}

//	@RequestMapping("/process-homepage")
//	public String showResultpage(UserInfoLogin user,Model model) {
//		System.out.println("username :"+user.getUsername());
//		System.out.println("crushname :"+user.getCrushname());
//		model.addAttribute("username", user.getUsername());
//		model.addAttribute("crushname", user.getCrushname());
//		return "result-page";
//	}
	
	
 // using session here when all cookies are disabed it wont allow to display
//	@RequestMapping("/process-homepage")
//	public String showResultpage(@Valid @ModelAttribute("userInformation") UserInfoLogin us, BindingResult result,
//			HttpServletResponse response, HttpServletRequest request) {
//
//		if (result.hasErrors()) {
//
//			List<ObjectError> l = result.getAllErrors();
//			for (ObjectError e : l) {
//				System.out.println("Error msg : " + e);
//			}
//
//			return "home-page";
//		}
//		HttpSession session = request.getSession();
//		session.setMaxInactiveInterval(100);
//		session.setAttribute("username", us.getUsername());
//		session.setAttribute("crushname", us.getCrushname());
//
//		String Processedresult = lcProcessRelationImpl.sendResult(us.getUsername(), us.getCrushname());
//		session.setAttribute("result", Processedresult);
////
////		Cookie mycookie=new Cookie("lc.username", us.getUsername());
////		mycookie.setMaxAge(30);
////		response.addCookie(mycookie);
//		
//		return "result-page";
//	}
	
	@RequestMapping("/process-homepage")
	public String showResultpage(Model model, @Valid UserInfoLogin userInformation, BindingResult result) {
		
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"userInformation", result); //for displaying the errors on jsp pages
		model.addAttribute("userInformation", userInformation);
		
		if (result.hasErrors()) {

			List<ObjectError> l = result.getAllErrors();
			for (ObjectError e : l) {
				System.out.println("Error msg : " + e);
			}

			return "home-page";
		}
		String Processedresult = lcProcessRelationImpl.sendResult(userInformation.getUsername(), userInformation.getCrushname());
		
		logger.debug("***********"+Processedresult);
		
		userInformation.setResult(Processedresult);
		
		return "result-page";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
