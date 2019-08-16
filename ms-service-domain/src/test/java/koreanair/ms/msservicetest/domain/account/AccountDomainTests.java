package koreanair.ms.msservicetest.domain.account;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import koreanair.ms.msservicetest.repository.AccountRepository;
import koreanair.ms.msservicetest.repository.TransferRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDomainTests {

	@Autowired
	AccountRepository repository;

	@Autowired
	TransferRepository transferrepository;

	@Autowired 
	AccountDS service;

	@Autowired
	AccountFactory factory;

	@Test
	@Transactional
	public void contextLoads() {
		saveAccount("a", 100);
		saveAccount("b", 500);

		transferWithDomainOperation("a", "b", 20);
		assertEquals(80, repository.findById("a").get().getBalance() );
		assertEquals(520, repository.findById("b").get().getBalance());

		
		transferWithDomainService("a", "b", 10);
		assertEquals(70, repository.findById("a").get().getBalance());
		assertEquals(530, repository.findById("b").get().getBalance());
	}

	private void transferWithDomainOperation(String from, String to, int amount) {
		Account accA = repository.findById(from).get();
		Account accB = repository.findById(to).get();

		accA.transfer(accB, amount);

		repository.save(accA);
		repository.save(accB);

	}

	private void transferWithDomainService(String from, String to, int amount) {
		Account accA = repository.findById(from).get();
		Account accB = repository.findById(to).get();

		service.transfer(accA, accB, amount);

		repository.save(accA);
		repository.save(accB);
	}

	private void saveAccount(String name, int balance) {
		Account a = factory.createAccount(name, balance);
		repository.save(a);
	}

}
