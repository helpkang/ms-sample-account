package com.koreanair.ms_ibe.service;

import javax.transaction.Transactional;

import com.koreanair.common.controller.PageRequest;
import com.koreanair.common.exception.BizException;
import com.koreanair.ms_ibe.domain.rp.Account;
import com.koreanair.ms_ibe.domain.rp.Transfer;
import com.koreanair.ms_ibe.domain.rp.ds.AccountDS;
import com.koreanair.ms_ibe.repository.AccountRepository;
import com.koreanair.ms_ibe.repository.TransferRepository;
import com.koreanair.ms_ibe.service.transfer.TransferAccount;
import com.koreanair.ms_ibe.service.vo.AccountVO;
import com.koreanair.ms_ibe.service.vo.CreateAccountVO;
import com.koreanair.ms_ibe.service.vo.TransferAccountVO;
import com.koreanair.ms_sample_account.domain.account.factory.AccountFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
    AccountRepository accountRepository;
    
    @Autowired
    TransferRepository transferRepository;


	AccountDS domainservice = new AccountDS();

    AccountFactory factory = new AccountFactory();

    @Transactional
    public void createAccount(CreateAccountVO vo){
        Account account = factory.createAccount(vo.getName(), vo.getInitBalance());
        accountRepository.save(account);
    }
    
    @Transactional
    public void transfer(TransferAccountVO trasferVO){
        
        Account accountFrom = accountRepository.findById(trasferVO.getFrom())
        .orElseThrow(()->new BizException("formAccountError", "from account가 없습니다."+trasferVO.getFrom()));
        
        Account accountTo = accountRepository.findById(trasferVO.getTo())
        .orElseThrow(()->new BizException("toAccountError", "from account가 없습니다."+trasferVO.getTo()));
        
        Transfer transfer = domainservice.transfer(accountFrom, accountTo, trasferVO.getAmount());
        
        transferRepository.save(transfer);
        
    }
    
    @Transactional
    public AccountVO getAccount(String name) {
        Account account = accountRepository.findById(name)
        .orElseThrow(()->new BizException("formAccountError", "from account가 없습니다."+name));
        return TransferAccount.accountToAccountVO(account);
    }
    
    @Transactional
    public Page<Transfer> getTransfer(String name, PageRequest pageRequest) {
        
        Account account = accountRepository.findById(name)
        .orElseThrow(()->new BizException("formAccountError", "from account가 없습니다."+name));

        Page<Transfer> ret = transferRepository.findByFromAccount(account.getName(), pageRequest.of());

        return ret;
    }

}