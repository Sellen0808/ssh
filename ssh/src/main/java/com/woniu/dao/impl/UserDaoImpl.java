package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.domin.User;

//@Repository
public class UserDaoImpl implements IUserDao{
	
//	@Autowired
	private SessionFactory sf;
	private Session getSession() {
		return sf.openSession();
	}
	
//	@Override
	public void save(User user) {
		Session s=getSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public void update(User user) {

		Session s=getSession();
		s.beginTransaction();
		s.update(user);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public void delete(Integer uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findOne(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
