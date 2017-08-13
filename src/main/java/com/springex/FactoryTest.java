package com.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {

	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("/applicationContext.xml");
		Printable p = (Printable) cont.getBean("p");
		p.print();
		//A a=(A) cont.getBean("a");

		//	a.print();
	}

}
