package koreanair.ms.msservicetest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.domain.account.AccountDomainService;
import koreanair.ms.msservicetest.domain.account.AccountFactory;
import koreanair.ms.msservicetest.repository.AccountRepository;
import koreanair.ms.msservicetest.service.vo.AccountVO;
import koreanair.ms.msservicetest.service.vo.CreateAccountVO;
import koreanair.ms.msservicetest.service.vo.TransferAccountVO;

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
    public void transfer(TransferAccountVO trasferVO){
        
        Account accountFrom = repository.findById(trasferVO.getFrom()).get();
        Account accountTo = repository.findById(trasferVO.getTo()).get();
        
        domainservice.transfer(accountFrom, accountTo, trasferVO.getAmount());
        
        repository.save(accountFrom);
        repository.save(accountTo);
        
    }
    
    @Transactional
    public AccountVO getAccount(String name) {
        Account account = repository.findById(name).get();
        return TransferAccount.accountToAccountVO(account);
    }

}