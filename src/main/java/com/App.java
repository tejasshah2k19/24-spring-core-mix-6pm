package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// singleton design pattern
//		UserBean user1 = new UserBean();
//		UserBean user2 = new UserBean();
//		UserBean user3 = new UserBean();
//
//		System.out.println(user1);
//		System.out.println(user2);
//		System.out.println(user3);

		// IoC container -> UserBean

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);

		UserBean user1 = context.getBean("userBean", UserBean.class);// runtime error
		UserBean user2 = context.getBean("userBean", UserBean.class);// runtime error
		UserBean user3 = context.getBean("userBean", UserBean.class);// runtime error

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}
}
