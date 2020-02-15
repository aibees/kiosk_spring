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
	
	// login form 페이지로 이동시키는 routing
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "login/userLogin";
	}
	
	// login page에서 사용자 로그인 데이터를 받는 mapping.
	// CustomerDTO로 직접 받아 service로 전달
	// login 처리 후 session 등록과 이전 페이지로 넘어가는 부분은
	// TODO : 추후 Intercepter 처리하면서 update 될 예정
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public void login(CustomerDTO customerdto, Model model) {
		System.out.println("customer : " + customerdto);
		Object result = service.LoginData(customerdto);
		System.out.println("result : " + result);
		model.addAttribute("loginUserModel", result);
		return;
	}
}
