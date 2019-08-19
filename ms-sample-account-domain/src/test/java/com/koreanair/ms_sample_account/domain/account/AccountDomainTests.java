package com.koreanair.ms_sample_account.domain.account;


import static org.junit.Assert.assertEquals;

import com.koreanair.ms_sample_account.domain.account.ds.AccountDS;
import com.koreanair.ms_sample_account.domain.account.factory.AccountFactory;

import org.junit.Test;



public class AccountDomainTests {

	AccountDS service = new AccountDS();

	AccountFactory factory = new AccountFactory();

	@Test
	public void contextLoads() {
		Account a = createAccount("a", 100);
		Account b = createAccount("b", 500);

		transferWithDomainOperation(a, b, 20);
		assertEquals(80, a.getBalance() );
		assertEquals(520, b.getBalance());

		
		transferWithDomainService(a, b, 10);
		assertEquals(70, a.getBalance());
		assertEquals(530, b.getBalance());
	}

	private void transferWithDomainOperation(Account from, Account to, int amount) {

		from.transfer(to, amount);
	}

	private void transferWithDomainService(Account from, Account to, int amount) {
	
		service.transfer(from, to, amount);

	}

	private Account createAccount(String name, int balance) {
		Account a = factory.createAccount(name, balance);
		return a;
	}

}
