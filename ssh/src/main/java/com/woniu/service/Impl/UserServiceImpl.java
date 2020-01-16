package com.woniu.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IUserDao;
import com.woniu.domin.User;
import com.woniu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	
	@Override
	public void saveTwo(User u1, User u2) {
		// TODO Auto-generated method stub
		 dao.save(u1);
		 
		 dao.save(u2);
	}
	
}
