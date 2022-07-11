package com.adi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //or @Component("hdfcAtm")
public class HdfcAtm implements Atm {
	
	@Autowired
	private Bank bank;

	public void withdraw(int acno, double amount) {
		System.out.println("Customer at HdfcAtm wants to withdraw money..");
		bank.withdraw(154, acno, amount);
	
		
	}
	

}
