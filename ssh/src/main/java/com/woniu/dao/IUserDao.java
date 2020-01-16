package com.woniu.dao;

import java.util.List;

import com.woniu.domin.User;

public interface IUserDao {
	void save(User user);
	void update(User user);
	void delete(Integer uid);
	User findOne(Integer uid);
	List<User> findAll();
	
}
