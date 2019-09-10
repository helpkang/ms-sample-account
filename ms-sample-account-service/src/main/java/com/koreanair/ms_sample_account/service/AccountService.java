package com.koreanair.ms_sample_account.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.koreanair.controller.PageRequest;
import com.koreanair.exception.BizException;
import com.koreanair.ms_sample_account.domain.account.Account;
import com.koreanair.ms_sample_account.domain.account.Transfer;
import com.koreanair.ms_sample_account.domain.account.ds.AccountDS;
import com.koreanair.ms_sample_account.domain.account.factory.AccountFactory;
import com.koreanair.ms_sample_account.repository.AccountRepository;
import com.koreanair.ms_sample_account.repository.TransferRepository;
import com.koreanair.ms_sample_account.service.transfer.TransferAccount;
import com.koreanair.ms_sample_account.service.vo.AccountVO;
import com.koreanair.ms_sample_account.service.vo.CreateAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferVO;

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
    public List<TransferVO> getTransfer(String name, PageRequest pageRequest) {
    	
    	List<TransferVO> transferVOlist = new ArrayList<TransferVO>();
        
        Account account = accountRepository.findById(name)
        .orElseThrow(()->new BizException("formAccountError", "from account가 없습니다."+name));

        Page<Transfer> ret = transferRepository.findByFromAccount(account.getName(), pageRequest.of());
        
        for (Transfer transfer : ret) {
        	transferVOlist.add(TransferAccount.transferToTransferVO(transfer));
		}

        return transferVOlist;
    }

}