package com.koreanair.ms_sample_account.service;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.koreanair.ms_sample_account.service.vo.AccountVO;
import com.koreanair.ms_sample_account.service.vo.CreateAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferAccountVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTests {

	@Autowired
	AccountService service;

	@Test
	@Transactional
	public void accountCreate() {
		service.createAccount(createCreateAccount("a", 100));
		assertEquals(100, getBalance("a"));
	}

	@Test
	@Transactional
	public void transfer() {
		service.createAccount(createCreateAccount("a", 100));
		service.createAccount(createCreateAccount("b", 200));
		service.transfer(TransferAccountVO.builder().from("a").to("b").amount(50).build());
		assertEquals(50, getBalance("a"));
		assertEquals(250, getBalance("b"));
	}
	
	
	private int getBalance(String name){
		return getAccount(name).getBalance();
	}

	private AccountVO getAccount(String name) {
		return service.getAccount(name);
	}

	private CreateAccountVO createCreateAccount(String name, int initBalance) {
		return CreateAccountVO.builder().name(name).initBalance(initBalance).build();
	}
}
