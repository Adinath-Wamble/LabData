package com.adi.copy;

import org.springframework.stereotype.Component;

@Component("sbiBank")
public class SbiBank implements Bank {
	
	public boolean isAccountPresent(int account) {
		if(account == 100311)
			return true;
	
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of SBI Bank wants to withdraw money..");
	
		
		
	}



}
