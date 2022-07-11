package com.adi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring_DI.xml");
		
		Atm atm = (Atm) ctx.getBean("hdfcAtm");
		atm.withdraw(20202020, 5000);
		

	}

}
