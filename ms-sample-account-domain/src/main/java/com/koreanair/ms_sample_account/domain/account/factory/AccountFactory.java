package com.koreanair.ms_sample_account.domain.account.factory;

import com.koreanair.ms_sample_account.domain.account.Account;

public class AccountFactory {
    public Account createAccount(String name, int balance){
        return Account.builder().name(name).balance(balance).build();
    }
}