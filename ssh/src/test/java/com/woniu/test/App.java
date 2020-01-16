package com.woniu.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.domin.User;

public class App {
	
	@Test
	public void test1() throws Exception {
		ApplicationContext ctx=// 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SessionFactory sf=(SessionFactory) ctx.getBean("sf");
		Session s=sf.openSession();
		 s.beginTransaction();
		 User user=new User();
		 user.setId(333);
		 user.setName("333");
		 user.setBirthday(new Date());
		 user.setMoney(555d);
		 s.save(user);
		 s.getTransaction().commit();
		 s.close();
	}
	
//	@Test
//	public void test2() throws Exception {
//		ApplicationContext ctx=//
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		IUserDao dao=(IUserDao) ctx.getBean("userDaoImpl");
//		User user=new User();
//		user.setId(null);
//		user.setName("Ò®öÕ");
//		user.setBirthday(new Date(0));
//		user.setMoney(666d);
//		
//		dao.save(user);
//	}
//	@Test
//	public void test3() throws Exception {
//		ApplicationContext ctx=//
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		IUserService service= (IUserService) ctx.getBean("userServiceImpl");
//		User u1=new User();
//		u1.setName("Å£ÀÉ");
//		u1.setBirthday(new Date(20));
//		u1.setMoney(100d);;
//		
//		User u2=new User();
//		u2.setName("Ö¯Å®");
//		u2.setBirthday(new Date(20));
//		u2.setMoney(10d);
//		service.saveTwo(u1, u2);
//	}

}
