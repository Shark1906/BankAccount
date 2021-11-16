package com.bankaccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("Aman", 1002, 5000);
		System.out.println(account);
		account.debitAccount(500, account);
		System.out.println(account);
	}
}
