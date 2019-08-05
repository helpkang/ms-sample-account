package koreanair.ms.msservicetest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.domain.account.Transfer;
import koreanair.ms.msservicetest.domain.factory.AccountFactory;
import koreanair.ms.msservicetest.domain.service.AccountDomainService;
import koreanair.ms.msservicetest.repository.AccountRepository;
import koreanair.ms.msservicetest.repository.TransferRepository;

@Service
public class AccountService {

	@Autowired
    AccountRepository repository;
    
    @Autowired
	TransferRepository transferrepository;

	@Autowired 
	AccountDomainService service;

	@Autowired
    AccountFactory factory;

    @Transactional
    public void createAccount(String name, int initBalance){
        Account account = factory.createAccount(name, initBalance);
        repository.save(account);
    }
    
    @Transactional
    public void transfer(String from, String to, int amount){
        
        Account accA = repository.findById(from).get();
        Account accB = repository.findById(to).get();
        
        Transfer transfer =  service.transfer(accA, accB, amount);
        
        repository.save(accA);
        repository.save(accB);
        
        transferrepository.save(transfer);
    }
    
    @Transactional
    public Account getAccount(String name) {
        Account account = repository.findById(name).get();
        List<Transfer> transferList = transferrepository.findByFromNameOrToName(name, name);
        account.setTransfers(transferList);
        return account;
        
    }

}