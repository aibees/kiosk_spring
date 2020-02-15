package com.aibees.kiosk.user.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.aibees.kiosk.user.model.sql.UserDao;

@Service("UserLoginService")
public class UserLoginServiceImpl implements LoginService {

	@Resource(name="CustomerDao")
	private UserDao dao;
	
	@Override
	public Object LoginData(Object obj) {
		return dao.loginDao(obj);
	}

}
