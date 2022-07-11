package com.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring_DI.xml");
		CarPartsInventory carPartsInventory = (CarPartsInventory) ctx.getBean("CarPartsInventoryImp1");
		
		//model/entity classes are not instantiated using Spring
		CarPart cp = new CarPart();
		cp.setPartName("ABC");
		cp.setCarModel("Adinath 800");
		cp.setPrice(520);
		cp.setQuantity(4);
		
		Long time = System.currentTimeMillis();
		carPartsInventory.addNewCarPart(cp);
		Long time2 = System.currentTimeMillis();
		System.out.println("Apporx time taken to execute the query "+(time-time2)+" in ms");
		

	}

}
