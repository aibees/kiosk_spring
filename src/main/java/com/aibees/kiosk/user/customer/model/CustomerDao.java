package com.aibees.kiosk.user.customer.model;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.aibees.kiosk.user.model.sql.UserDao;

@Repository("CustomerDao")
public class CustomerDao implements UserDao {

	public static final String PREFIX = "com.aibees.kiosk.user";
	
	@Resource(name="sqlSession")
	private SqlSession session;
	
	@Override
	public Object loginDao(Object obj) {
		System.out.println("in dao : " + obj);
		Object result = session.selectOne(PREFIX + ".login", obj);
		System.out.println("in session result : " + result);
		return result;
	}
	
}
