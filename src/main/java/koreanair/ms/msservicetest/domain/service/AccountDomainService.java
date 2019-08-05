package koreanair.ms.msservicetest.domain.service;

import org.springframework.stereotype.Component;

import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.domain.account.Transfer;

@Component
public class AccountDomainService {
    
   
    public Transfer transfer(Account from, Account to, int amount) {
        if( amount <=0){
            throw new RuntimeException("이체금액은 0보다 커야 합니다.");
        }
        if(from.getBalance()< amount){
            throw new RuntimeException("잔액이 부족합니다.");
        }
        from.reduceBalance(amount);
        to.incrementBalance(amount);
        return Transfer.builder().fromName(from.getName()).toName(to.getName()).amount(amount).build();
    }

}