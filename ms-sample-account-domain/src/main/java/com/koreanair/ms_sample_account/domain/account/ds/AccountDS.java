package com.koreanair.ms_sample_account.domain.account.ds;

import com.koreanair.ms_sample_account.domain.account.Account;
import com.koreanair.ms_sample_account.domain.account.Transfer;

public class AccountDS {
    
   
    public Transfer transfer(Account from, Account to, int amount) {
        if( amount <=0){
            throw new RuntimeException("이체 금액은 0보다 커야 합니다.");
        }
        if(from.getBalance()< amount){
            throw new RuntimeException("잔액이 부족합니다.");
        }
        from.reduceBalance(amount);
        to.incrementBalance(amount);
        Transfer transfer = Transfer.builder().fromAccount(from).toAccount(to).amount(amount).build();
        return transfer;
    }

}