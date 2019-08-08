package koreanair.ms.msservicetest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.domain.account.AccountDomainService;
import koreanair.ms.msservicetest.domain.account.AccountFactory;
import koreanair.ms.msservicetest.domain.account.Transfer;
import koreanair.ms.msservicetest.repository.AccountRepository;
import koreanair.ms.msservicetest.repository.TransferRepository;

@Service
public class AccountService {

	@Autowired
    AccountRepository repository;


	@Autowired 
	AccountDomainService domainservice;

	@Autowired
    AccountFactory factory;

    @Transactional
    public void createAccount(CreateAccountVO vo){
        Account account = factory.createAccount(vo.getName(), vo.getInitBalance());
        repository.save(account);
    }
    
    @Transactional
    public void transfer(String from, String to, int amount){
        
        Account accA = repository.findById(from).get();
        Account accB = repository.findById(to).get();
        
        domainservice.transfer(accA, accB, amount);
        
        repository.save(accA);
        repository.save(accB);
        
    }
    
    @Transactional
    public AccountVO getAccount(String name) {
        Account account = repository.findById(name).get();
        // TODO: domain to vo convert
        return TransferAccount
        
    }

}