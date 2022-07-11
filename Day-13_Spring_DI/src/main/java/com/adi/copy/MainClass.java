package com.adi.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring_DI.xml");
		
		Atm atm = (Atm) ctx.getBean("hdfcAtm2");
		atm.withdraw(100311, 5000);
		

	}

}
