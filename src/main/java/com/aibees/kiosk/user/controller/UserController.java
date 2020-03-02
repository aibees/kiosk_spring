package com.aibees.kiosk.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aibees.kiosk.user.customer.model.vo.CustomerDTO;
import com.aibees.kiosk.user.service.LoginService;

@Controller
public class UserController {
	
	@Resource(name="UserLoginService")
	private LoginService service;
	
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "login/userLogin";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(CustomerDTO customerdto, Model model) {
		System.out.println("customer : " + customerdto);
		Object result = service.LoginData(customerdto);
		System.out.println("result : " + result);
		model.addAttribute("loginUserModel", result);
		return "redirect:main.do";
	}
}
