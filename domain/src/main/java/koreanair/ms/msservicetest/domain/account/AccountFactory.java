package koreanair.ms.msservicetest.domain.account;

import org.springframework.stereotype.Component;

import koreanair.ms.msservicetest.domain.account.Account;

@Component
public class AccountFactory {
    public Account createAccount(String name, int balance){
        return Account.builder().name(name).balance(balance).build();
    }
}