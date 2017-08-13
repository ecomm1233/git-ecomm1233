package com.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {

	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		
		A a=cont.getBean("a",A.class);
		
		//a.display();

	}

}
