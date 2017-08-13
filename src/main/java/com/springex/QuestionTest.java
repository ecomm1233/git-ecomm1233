package com.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Question q = (Question) context.getBean("q");
		q.displayInfo();

	}

}
