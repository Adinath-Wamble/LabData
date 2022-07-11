package com.adi.copy;

public interface Bank {
	public boolean isAccountPresent(int account);
	public void withdraw(int atmId, int acno, double amount);

}
