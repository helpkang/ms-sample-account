package com.koreanair.ms_sample_account.domain.factory;

import org.springframework.stereotype.Component;

import com.koreanair.ms_sample_account.domain.account.Account;

@Component
public class AccountFactory {
    public Account createAccount(String name, int balance){
        return Account.builder().name(name).balance(balance).build();
    }
}