package com.adi.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm2") //or @Component("hdfcAtm")
public class HdfcAtm implements Atm {
	
	@Autowired
	private List<Bank> bank;

	public void withdraw(int acno, double amount) {
		System.out.println("Customer at HdfcAtm wants to withdraw money..");
		Bank currentBank = null;
		for(Bank banks : bank) {
			if(banks.isAccountPresent(acno)) {
				currentBank = banks;
				break;
			}
		}
		
		currentBank.withdraw(100311, acno, amount);
		
	
		
	}
	

}
