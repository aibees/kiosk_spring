package com.aibees.kiosk.user.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionCheckInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser") == null) {
			System.out.println("session is null");
			
			String uri = request.getRequestURI();
			String query = request.getQueryString();
			String path = uri;
			
			if(request.getMethod().equalsIgnoreCase("get")) {
				path = uri + "?" + query;
			}
			
			session.setAttribute("dest", path);
			response.sendRedirect("/login.do");
			return false;
		}
		return true;
	}
}
