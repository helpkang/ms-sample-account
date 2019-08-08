package koreanair.ms.msservicetest.service;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTests {

	@Autowired
	AccountService service;

	@Test
	@Transactional
	public void accountCreate() {
		service.createAccount(createCreateAccount("a", 100));
		AccountVO a = service.getAccount("a");
		assertEquals(100, a.getBalance());
	}

	private CreateAccountVO createCreateAccount(String name, int initBalance) {
		return CreateAccountVO.builder().name(name).initBalance(initBalance).build();
	}

	@Test
	@Transactional
	public void transfer() {
		service.createAccount(createCreateAccount("a", 100));
		service.createAccount(createCreateAccount("b", 200));
		service.transfer("a", "b", 50);
		assertEquals(50, service.getAccount("a").getBalance());
		assertEquals(250, service.getAccount("b").getBalance());
	}

}
