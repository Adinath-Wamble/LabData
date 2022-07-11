package com.adi.copy;

import org.springframework.stereotype.Component;

@Component
public class CityBank implements Bank {
	
	public boolean isAccountPresent(int account) {
		if(account == 2580)
			return true;
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of CitiBank wants to withdraw money..");
	
	
		
		
	}



}
