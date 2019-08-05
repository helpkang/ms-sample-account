package koreanair.ms.msservicetest.domain.service;

import org.springframework.stereotype.Component;

import koreanair.ms.msservicetest.domain.account.Account;

@Component
public class AccountDomainService {
    
   
    public void transfer(Account from, Account to, int ammount){
        if( ammount <=0){
            throw new RuntimeException("이체금액은 0보다 커야 합니다.");
        }
        if(from.getBalance()< ammount){
            throw new RuntimeException("잔액이 부족합니다.");
        }
        from.reduceBalance(ammount);
        to.incrementBalance(ammount);
    }

}