package com.koreanair.ms_ibe.service;


import static org.junit.Assert.assertEquals;

import com.koreanair.ms_ibe.domain.rp.Account;
import com.koreanair.ms_ibe.domain.rp.Transfer;
import com.koreanair.ms_ibe.repository.AccountRepository;
import com.koreanair.ms_ibe.repository.TransferRepository;
import com.koreanair.ms_ibe.service.vo.AccountVO;
import com.koreanair.ms_ibe.service.vo.CreateAccountVO;
import com.koreanair.ms_ibe.service.vo.TransferAccountVO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountServiceTests {

	@Autowired
	AccountService service;

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	TransferRepository transferRepository;

	@Test
	public void accountCreate() {
		service.createAccount(createCreateAccount("a", 100));
		assertEquals(100, getBalance("a"));
	}

	@Test
	public void transfer() {
		service.createAccount(createCreateAccount("a", 100));
		service.createAccount(createCreateAccount("b", 200));
		service.transfer(TransferAccountVO.builder().from("a").to("b").amount(50).build());
		assertEquals(50, getBalance("a"));
		assertEquals(250, getBalance("b"));
	}


	@Test
	public void transferPaging() {
		String from = "from_";
		String to = "to_";
		service.createAccount(createCreateAccount(from, 100));
		service.createAccount(createCreateAccount(to, 200));
		service.transfer(TransferAccountVO.builder().from(from).to(to).amount(1).build());
		service.transfer(TransferAccountVO.builder().from(from).to(to).amount(2).build());
		service.transfer(TransferAccountVO.builder().from(from).to(to).amount(3).build());
		service.transfer(TransferAccountVO.builder().from(from).to(to).amount(4).build());
		Account fromAccount = accountRepository.findById(from).get();

		PageRequest pp = PageRequest.of(0, 2);
		Page<Transfer> page = transferRepository.findByFromAccount(fromAccount.getName(), pp);
		log.debug("page: {}", page);

		page.get().forEach(
			(transaction)->{log.debug("transaction:{}", transaction);}
		);

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
