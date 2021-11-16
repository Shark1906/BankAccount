package com.bankaccount;

public class Account {
	
	private String name;
	private long accountNum;
	private int balance;
	
	public Account(String name, long accountNum, int balance) {
		super();
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public int debitAccount(int amount, Account account) {
		if(amount>account.balance) {
			System.out.println("withraw limit reached");
		}
		else {
			account.balance = account.balance - amount;
			System.out.println("Rs." + amount + " Debited Successfully");
		}
		return this.balance;		
	}

	@Override
	public String toString() {
		return "Name=" + name + ", AccountNum=" + accountNum + ", Balance=" + balance;
	}
}
