package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.AddressBean;
import com.bean.EmployeeBean;
import com.bean.StudentBean;
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
		System.out.println(user1.getFirstName());
		System.out.println(user2.getFirstName());
		System.out.println(user3.getLastName());

		StudentBean s1 = context.getBean("studentBean", StudentBean.class);
		StudentBean s2 = context.getBean("studentBean", StudentBean.class);
		StudentBean s3 = context.getBean("studentBean", StudentBean.class);

		System.out.println("s1 => " + s1);
		System.out.println("s2 => " + s2);
		System.out.println("s3 => " + s3);
		
		
		 
		EmployeeBean emp = context.getBean("empBean",EmployeeBean.class);
		
		System.out.println(emp);
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getAddress());
		
		
		//?? 

	}
}
