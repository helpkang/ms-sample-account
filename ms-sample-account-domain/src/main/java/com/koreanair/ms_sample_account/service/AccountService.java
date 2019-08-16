package com.koreanair.ms_sample_account.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreanair.ms_sample_account.domain.account.Account;
import com.koreanair.ms_sample_account.domain.account.ds.AccountDS;
import com.koreanair.ms_sample_account.domain.factory.AccountFactory;
import com.koreanair.ms_sample_account.repository.AccountRepository;
import com.koreanair.ms_sample_account.service.transfer.TransferAccount;
import com.koreanair.ms_sample_account.service.vo.AccountVO;
import com.koreanair.ms_sample_account.service.vo.CreateAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferAccountVO;

@Service
public class AccountService {

	@Autowired
    AccountRepository repository;


	@Autowired 
	AccountDS domainservice;

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