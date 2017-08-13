package com.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Employee employee=(Employee) context.getBean("e");
		employee.show();
	}

}
